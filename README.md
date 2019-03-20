# REST-ASSURED-WORKSHOP

## Benodigde software

Tijdens de workshop gaan we gebruik maken van het project https://github.com/RenzoH89/rest-assured-workshop.


Om dit project te kunnen gebruiken dien je een aantal zaken te installeren:

*	GIT (https://git-scm.com/downloads)
*	Intellij IDEA Community Edition (2018.3) (https://www.jetbrains.com/idea/download/)
*	Maven (https://maven.apache.org/download.cgi) (zip)
*	Java JDK 8 (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

De zip met Maven dien je enkel uit te pakken, de andere zaken kun je daadwerkelijk installeren. 

Na de installatie moeten we nog wat omgevingsvariabelen instellen om daadwerkelijk je omgeving klaar te zetten voor het REST-Assured project. Voer hiervoor de volgende stappen uit:

1.	Gebruik 'Zoeken' om te zoeken naar 'Systeem' (Configuratiescherm) en selecteer deze optie vervolgens.
2.	Klik op de koppeling Geavanceerde systeeminstellingen.
3.	Klik op Omgevingsvariabelen.
4.	Voeg de volgende systeemvariabelen toe afhankelijk van de locatie van je installaties. Vervang de onderstaande XXXX'en met de daadwerkelijke versie. Hieronder 2 voorbeelden:
  * MAVEN_HOME = C:\dev\apache-maven-XXXX
  * JAVA_HOME =  C:\Program Files \Java\jdkXXXX
5.	breid de variable PATH uit (onder systeemvariabelen) met %MAVEN_HOME%\bin en %JAVA_HOME%\bin;
6.	Open nu een nieuwe opdracht prompt of terminal. Voer de volgende commando’s uit
  * **java -version** (Er zou een bericht moeten verschijnen met 'java version 1.8.xxx')
  * **mvn -v** (Er zou een bericht moeten verschijnen met 'Apache Maven 3.xxxx')
7. Is stap 6 niet gelukt? Controleer dan nogmaals je omgevingsvariabelen.
