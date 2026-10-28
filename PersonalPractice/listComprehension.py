


doubles = [index*2 for index in range(2, 21) ]

print(doubles)


names = ["chizzy", "tolola", "naafiu", "rebecca", "gordons", "vision", "ekuke"]

namesTwo = [name[0] for name in names]

print(namesTwo)

doublesTwo = [index*5 for index in range(1, 6)]

schools = ["privbabcock", "privcovenenat", "privleadcity", "yabatech", "unilag"]

schoolsProcessed = [school for school in schools if school[0] != "p"]

print(schoolsProcessed)
