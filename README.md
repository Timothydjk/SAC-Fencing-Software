#SAC-Fencing-Software

A "Fencing Time" software for SAC-formatted tournaments.

##Importing into Eclipse
This assumes you have already cloned the repository somewhere on your computer.

1. The first thing you need to do is download the EE version of Eclipse from the Eclipse website. On their download page it should be called something like "Eclipse IDE for Java EE Developers".

2. Once you install the new version, you need to enable the Git Repository explorer. In the Menu bar go to Window > Show View > Other, then choose the "Git Repositories" option in the Git folder.

3. In the git repository explorer, click the button to add an existing repository (the one with the green plus sign), browse to the folder that the repository is located in, select it and press finish. Now the repository should appear in the repository explorer.

4. Right click the repository and click "Import Projects...". Select "Import as General Project" and then press next until it finishes.

5. Now the project should appear in the package explorer, but it is not recognized as a java project. Right click on the project and go to Properties. Go to "Project Facets" and click "Convert to Faceted form...". In the list check Java and click apply.

##Setting Up Eclipse
1. Make sure to add the res/ folder to your build path
