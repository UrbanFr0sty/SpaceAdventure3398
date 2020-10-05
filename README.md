# Space Adventure 3398
> Space Adventure 3398 is an arcade style game is developed by Tanner Coker, Lucas Anesti, Brice Ashburn, Erik Cortez, and Eric Figueroa.
> It will feature a main menu with options to: start the game, view the scoreboard, go to settings, and to exit the game. 
> The game will have a space theme and it will be similar to a retro arcade game. The gameplay will consist of the player having basic 
> movements and having to shoot projectiles at the enemies in order to wipe them out. The player will be able to progress through 
> stages and will encounter boss fights and more difficult enemies along their travels. The game will save the top scores of 
> all players across multiple play sessions which is viewable in the scoreboard. Players can also find some settings and will be 
> able to tweak some gameplay settings through a settings area which is on the main menu.
> We're creating this game to further develop our skills as programmers but also it entertaining for anybody to enjoy.
> The audience for Space Advenuter 3398 can be for everyone or people who just want to play a fun arcade style game. 

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
The goal of the project is to make an entertaining game while practicing sound Software Engineering principles in a team.

Here is a picture of our game logo:


![Example screenshot](./images/pixil-frame-0.png)


## Technologies
* Java version 11.0.8 (https://www.oracle.com/java/) 
* Git	version 2.17.1 (https://github.com/team) 
* Sourcetree version 4.0.2 (https://support.atlassian.com/bitbucket-cloud/docs/tutorial-learn-bitbucket-with-sourcetree/)
* Jira (https://www.atlassian.com/software/jira)
* BitBucket (https://bitbucket.org/product)

## Setup
* Follow the hyperlinks listed above to set up your local enviorment needed.

## Code Examples


* Code is in progess...

## Features


Features list:


* Ship Builder- player will be able to choose and customize their ship for gameplay. Corresponds to Controllabe Character user story


* Cheat Codes- player will be able to tweak gameplay features by inputing a special code with game controls. Corresponds to Cheat/Bonus user story


* Boss Level Difficulty- player will be able to choose difficulty of game before starting. Corresponds to Scalable Difficulty user story


To-do list:


* Design a UML for overall game


* Create the game mechanics


* Create a background (non-thematic)


* Create players/enemies of game


* Create game menu

## Status
Project is: 


* In progess...

## Inspiration
Project inspired by aracde style games.

## Contact
Created by Tanner Coker, Lucas Anesti, Brice Ashburn, Erik Cortez and Eric Figueroa.

# Sprint 1 Review (Assignment 11)

### Lucas Anesti
The Design Patterns that will be used for the game have been finalized and the code for the class design have been implemented. In addition, both unit testing for the individual design patterns and integration testing between the patterns have been completed using JUnit. The following two documents demonstrate the progress made:

![Sample UML](./doc/UML/ShipDecorator.jpg)

![JUnit Test Results](./images/testResult.png)

Currently, the code and the documentation is stored under the DesignPatterns branch. The following links can be used to find:

* Documentation: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/doc/UML/

* Source Code: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/src/main/java/SpaceAdventure3398/

* Testing Code: https://bitbucket.org/cs3398f20klingons/space-adventure-3398/src/DesignPatterns/src/test/java/SpaceAdventure3398/

The code shows basic application of some of the design patterns and how to use them in reference to the game. The design patterns will become more relevant as we update the game design to include more features. For the time being, that remain a separate and abstract component of the game design process until the initial game units have been implemented and ready to be combined.

Currently, they are not used by the team and not intended to be merged into the Development branch.

To run the code, checkout the 'DesignPatterns' branch, navigate to the directory where the build.xml file is and run the following commands in the specified order: 'ant clean, ant compile, ant jar, ant run'. You should see descriptive output of design patterns and interactions among them.

To run the tests, checkout the 'DesignPatterns' branch, navigate to the main directory, and run the commands 'gradle build' and 'gradle test'. Once the buikld is succesful, the report for the test can be found ubder build/report/tests/test/index.html.

## Status

* Lucas Anesti: almost there.

## Next Steps (Assignment 11)

* Lucas Anesti: The next steps for me would be to incorporate the design patterns into the running code. This will require combingin and removing code, updating or replacing stubs with code created by teammates, rewriting the javadoc documentation, and redesigning unit and integration testing for the patterns using concrete objects. 




## Retrospective (Assignment 11)

### What went well

* Team:

* Lucas Anesti: I was able to find some design patterns that are applicable and useful to our game. We believe that the patterns will help us write more flexible, extensible, and thread safe code. However, limited knowledge of design patterns required me to do extensive research on the justification and the implementation of each pattern. As a result, the time spent on completing the tasks exceeds the projected numbers by a large margin.

* 
* 
* 
* 


### What might be Impeding us

* Our schedule conflict is posiibly impeding us from performing better. Many of us work on the weekends, so our meetings are held late during some weekdays. In addition,we do not have much experience with game design and implementation.

### What can we do to improve

* Team: 

* Lucas Anesti: 




