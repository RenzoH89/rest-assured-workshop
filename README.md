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

## Project uitchecken en openen
Nu alles is geinstalleerd kan het project uigecheckt worden. Dit kan je doen via GIT (maar eventueel ook door het project als zip te downloaden en uit te pakken).

In het geval van GIT
1. Navigeer naar de directory waar je het project wilt uitchecken
2. Clone het project met het onderstaande commando
  * git clone https://github.com/RenzoH89/rest-assured-workshop.git    
 
## Project openen met IntelliJ
Er zijn meerdere manieren om het project te openen met IntelliJ. Belangrijk is dat het project als Maven project herkend gaat worden in Intellij. Hieronder een mogelijkheid:

1. Kies voor de optie 'Open' als je IntelliJ opent (Welcome to IntelliJ IDEA scherm)
2. Navigeer naar de directory waar het REST-assured project staat
3. Selecteer binnen de directory het pom.xml bestand
4. IntelliJ geeft aan dat de pom.xmnl een project file is. Kies als optie 'Open as Project'
5. Het project wordt nu ingeladen en hoogtwaarschijnlijk mis je nog een aantal plugins. Installeer deze en herstart IntelliJ:
  * Cucumber For Java
  * Gherkin
6. Open de terminal binnen IntellIj en voer het commando mvn clean install uit. In de terminal dient het bericht 'Build Success' te verschijnen.

## Uitvoeren voorbeeld testcase
Als alles gelukt is zou je nu in staat moeten zijn om de het eerste scenario uit de file 'slideshow.feature' te draaien binnen IntelliJ.
Het pad naar het bestand is als volgt: {directory workshop}/src/test/resources/features/slideshow.feature. Het scenario wat wij willen afspelen is als volgt:

```
  Scenario: 1. The retrieved slideshow should contain 2 slides
    When I retrieve information about a slideshow
    And the slideshow contains 2 slides
```

Klik binnen IntellIJ met je rechtermuisknop op deze regels, en kies de optie "Run 'Scenario: 1. The retrieved slideshow should contain 2 slides'". De test zou moeten slagen.
  




  
