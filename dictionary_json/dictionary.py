import json
dictionary = {"cat":"kissa","dog":"koira","horse":"hevonen"}
while True:
    word = input("Give me a word or enter to EXIT? ")
    if not word: break
    if word in dictionary:
        print(f"{word} = {dictionary[word]}")
    else:
        definition = input(f"{word} not found. Please give me a definition or enter to EXIT? ")
        if not definition: break
        if definition:
            dictionary[word] = definition
    try:
        with open("data.json", "w") as outfile:
            json.dump(dictionary, outfile)
    except OSError:
        print("Error trying to write definition")