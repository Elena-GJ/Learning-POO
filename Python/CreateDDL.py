# Imports
import os
import csv

# Create DDLs for project
# Localize path on Desktop or create it
path = "C:\\Users\\garji\\OneDrive\\Desktop\\Docs\\DDLs"
if not os.path.exists(path):
    os.makedirs(path)

# Change to that directory
os.chdir(path)

# Create the DLL file and open it for editing
newFileName = input("Introduce el nombre de la DDL con nomenclatura ZettaBeat: ")
fileExists = os.path.isfile(path)
if fileExists:
    print("El archivo ya existe")
else:
    newFile = open(newFileName + ".ddl", "x")

# Introduce header
newFile.write("DROP TABLE IF EXISTS " + newFileName + "\n")
newFile.write("CREATE TABLE IF NOT EXISTS " + newFileName + "(" + "\n")

# Introduce body with columns
csvFileName = "Columnas.csv"
rowDelimiter = "\n"
columnDelimiter = input("Introduce el caracter separador de columnas: ")
csvFile = open(csvFileName, 'r')
csvFileReader = csv.reader(csvFile, delimiter = rowDelimiter, quotechar = columnDelimiter)
for row in csvFileReader:
    newFile.write("    " + row[0][0] + " VARCHAR" + "," + "\n")

# Determine PKs
newFile.write("PRIMARY KEY ()")

# Rows and columns
newFile.write("ROW FORMAT DELIMITED")
newFile.write("FIELDS TERMINATED BY '" + columnDelimiter + ");")

# Close the file once modified
newFile.close()

