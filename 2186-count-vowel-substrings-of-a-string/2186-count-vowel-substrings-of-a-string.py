class Solution:
    def countVowelSubstrings(self, word: str) -> int:
        vowels = set("aeiou")
        count = 0

        for left in range(len(word)):
            seen = set()

            for right in range(left , len(word)):
                if word[right] not in vowels:
                    break
                seen.add(word[right])

                if len(seen) == 5:
                    count += 1
        return count

