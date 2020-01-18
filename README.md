# REST-ASSURED-WORKSHOP

## Benodigde software

Tijdens de workshop gaan we gebruik maken van het project https://github.com/RenzoH89/rest-assured-workshop.

Voor dit project dient de volgende software geïnstalleerd te zijn:

*	GIT (https://git-scm.com/downloads)
*	Intellij IDEA Community Edition (**2018.3**) (https://www.jetbrains.com/idea/download/)
*	Java JDK 8 (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
*	Maven (https://maven.apache.org/download.cgi) (**optioneel, zit al in IntelliJ**)

### Extra informatie voor GIT (Windows) installatie

Het is bij de GIT installatie op **Windows** handig om de optie 'Git Bash here' aangevinkt te houden. Deze optie gaan we later gebruiken bij het uitchecken van het project:

![GitBash](https://github.com/RenzoH89/rest-assured-workshop/blob/master/screenshots/gitbash.PNG)

Kies verderop in de installatie bij het scherm 'Adjusting your PATH environment' voor de optie 'Use GIT from Git Bash only' of voor de default optie 'Git from the command line and also from 3rd-party software'

### Instructies bij installatie Java JDK 8
> Heb je de Java JDK al eerder volledig geinstalleerd en geconfigureerd, dan kan je de onderstaande stappen overslaan en direct naar de sectie "Project uitchecken en openen" navigeren. Zo niet, volg dan de stappen hieronder.

Na de installatie van de JDK moeten we nog een omgevingsvariabele instellen om je machine klaar te maken voor het REST-Assured project. Voer hiervoor de volgende stappen uit (De stappen zijn gebaseerd op Windows):

> Let op! Gebruik je een Mac? Bekijk dan https://stackoverflow.com/questions/21964709/how-to-set-or-change-the-default-java-jdk-version-on-os-x voor het zetten van de JAVA_HOME variabele.

1.	Gebruik 'Zoeken' om te zoeken naar 'Systeem' (Configuratiescherm) en selecteer deze optie vervolgens.
2.	Klik op de koppeling Geavanceerde systeeminstellingen.
3.	Klik op Omgevingsvariabelen.
4.	Voeg de volgende systeemvariabele toe afhankelijk van de locatie van je installatie. Vervang de onderstaande XXXX'en met de daadwerkelijke versie:
  * JAVA_HOME =  C:\Program Files \Java\jdkXXXX
5.	bereid de variable PATH uit (onder systeemvariabelen) met %JAVA_HOME%\bin;
6.	Open nu een **nieuwe** opdracht prompt of terminal. Voer de volgende commando’s uit
  * **java -version** (Er zou een bericht moeten verschijnen met 'java version 1.8.xxx')
7. Is stap 6 niet gelukt? Controleer dan nogmaals je omgevingsvariabelen.

---

## Project uitchecken en openen
Nu alles is geinstalleerd kan het project uitgecheckt worden. Dit kun je doen via GIT.

Windows:
1. Navigeer naar de directory waar je het project wilt uitchecken
2. Druk op de rechtermuisknop en kies de optie 'Git Bash here'
3. Clone het project vervolgens door in Git Bash het onderstaande commando uit te voeren
* ``` git clone https://github.com/RenzoH89/rest-assured-workshop.git ```

Mac:
1. Open een nieuwe terminal en navigeer naar de directory waar je het project uit wilt checken.
Je kan vervolgens met het commando 'cd' navigeren naar een onderliggende map. Met 'mkdir' maak je een map aan. In het onderstaande voorbeeld maken we de map Workshop aan in de directory Documents en open we deze vervolgens:

```
cd Documents/
mkdir Workshop
cd Workshop
```

2. Clone het project door in je terminal het onderstaande commando uit te voeren:
* ``` git clone https://github.com/RenzoH89/rest-assured-workshop.git ```
 ---

## Project openen met IntelliJ
Er zijn meerdere manieren om het project te openen met IntelliJ. Belangrijk is dat het project als Maven project herkend gaat worden in Intellij. Hieronder een mogelijkheid:

1. Nadat je Intellij hebt geopend dien je de optie 'Open' te kiezen (Welcome to IntelliJ IDEA scherm)
2. Navigeer naar de directory waar het REST-assured project staat
3. Selecteer binnen de directory het pom.xml bestand
![OpenProject](https://github.com/RenzoH89/rest-assured-workshop/blob/master/screenshots/openProject.PNG)
4. IntelliJ geeft aan dat de pom.xml een project file is. Kies als optie 'Open as Project'
5. Het project wordt nu ingeladen en hoogtwaarschijnlijk mis je nog een aantal plugins. Installeer deze en herstart IntelliJ:
  * Cucumber For Java
  * Gherkin
5. Zorg ervoor dat de maven plugins geladen worden: Kies eventueel voor 'Enable Auto Import'
6. Zoek binnen IntelliJ de klasse RunCucumberIT op binnen opdracht-0: {directory workshop}/opdracht-0/src/test/resources/features/slideshow.feature. En druk op de groene pijltjes om de testen te draaien:

![CucumberRunnerIT](https://github.com/RenzoH89/rest-assured-workshop/blob/master/screenshots/runCucumber.PNG)

7. Als alles gelukt is, dan zou je het volgende moeten zien:

![TestRunSuccess](https://github.com/RenzoH89/rest-assured-workshop/blob/master/screenshots/runSuccess.PNG)

---

## Uitvoeren voorbeeld testcase
Als alles gelukt is zou je nu ook in staat moeten zijn om de het eerste scenario uit de file 'slideshow.feature' los te draaien binnen IntelliJ.
Het pad naar het bestand is als volgt: {directory workshop}/opdracht-0/src/test/resources/features/slideshow.feature. Het scenario wat wij willen afspelen is als volgt:

```
  Scenario: 1. The author and 2 slides are returned
    When I retrieve information about a slideshow
    Then the author of the slideshow is "Yours Truly"
    And the slideshow contains 2 slides
```

Klik binnen IntellIJ met je rechtermuisknop op deze regels, en kies de optie "Run 'The author and 2 slides are returned'". De test zou moeten slagen.
**Lukt dit niet? Controleer dan of de plugin SubStep actief is binnen IntellIJ. Schakel deze uit!**
