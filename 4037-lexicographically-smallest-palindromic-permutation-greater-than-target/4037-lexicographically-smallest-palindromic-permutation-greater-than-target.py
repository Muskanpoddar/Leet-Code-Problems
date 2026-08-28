from collections import Counter

class Solution:
    def lexPalindromicPermutation(self, s: str, target: str) -> str:
        count = Counter(s)

        odd = 0
        middle = ""

        for ch in count:
            if count[ch] % 2 == 1:
                odd += 1
                middle = ch

        if odd > 1:
            return ""

        half_count = {}

        for ch in count:
            half_count[ch] = count[ch] // 2

        half_len = len(s) // 2
        target_half = target[:half_len]

        def build(pos, greater, current):
            if pos == half_len:
                left = "".join(current)
                palindrome = left + middle + left[::-1]

                if palindrome > target:
                    return palindrome

                return ""

            for ch in "abcdefghijklmnopqrstuvwxyz":
                if half_count.get(ch, 0) == 0:
                    continue

                # If we haven't become greater yet,
                # we must not choose a character smaller than target.
                if not greater and ch < target_half[pos]:
                    continue

                half_count[ch] -= 1
                current.append(ch)

                new_greater = greater or ch > target_half[pos]

                answer = build(
                    pos + 1,
                    new_greater,
                    current
                )

                if answer:
                    return answer

                current.pop()
                half_count[ch] += 1

            return ""

        return build(0, False, [])