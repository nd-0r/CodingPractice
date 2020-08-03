def valid_word_nest(word, nest):
    print("word: " + word + "   nest: " + nest)
    if (len(nest) < 1 or word not in nest or (nest.rfind(word) > nest.find(word))):
        return False
    if (word == nest):
        return True
    return valid_word_nest(word, nest[:nest.find(word)] + nest[(nest.find(word) + len(word)):])

print(valid_word_nest("broadcast", "broadcbroadcastbroadcastast"))