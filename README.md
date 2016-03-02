# Course PM for Software Engineering Project (DAT255/DIT543) 7.5 HEC, Spring 2016

## News
Mar 02: Homepage is up and running. The homepage will be continuously edited, reflecting the evolution of the course.

[C1]: https://github.com/hburden/DAT255/blob/master/Slides/HttpsUrlConnectionDemo.java?raw=true
[C2]: https://github.com/hburden/DAT255/blob/master/Slides/Base64Example.java?raw=true

## Course Description
Software remains malleable, often illogical, and incomplete forever. *Sequential approaches* to software development, such as the *waterfall model*, assumes that it is possible to take every single variable that could affect a project into account beforehand. Considerable effort is spent to identify risks, plan mitigation, and what consequences these may have. From a traditional product perspective, this can be compared to creating an assembly line to produce software.

Given the nature of software, is it really feasible to identify all variables beforehand? *Iterative and incremental approaches* accepts that changes are inevitable and integrates change management into the development process. *Agile approaches* promotes iterative and incremental development by using a very tight *design-code-test* cycle. If we again use a traditional product perspective, this can be compared to new product development.

## Course Project
Most of the course time is spent on a course project. This year the project is run in collaboration with Volvo Bus and Keolis with the aim to improve the daily maintenance of the electric and hybrid buses of route 55. More details about the challenge will be presented at the [workshop given on the 13th of April][L4].

## Learning outcomes
In this course you will learn how to design and develop software, and to manage projects:
- Knowledge and understanding, the student should be able to:
	- identify the complexities of software design and development
	- describe the fundamentals of software engineering, such as stakeholders and requirements
	- describe the difference between the Customer, the Solution, and the Endeavour as well as the different methods used for each

- Skills and abilities, the student should be able to:
	- elicitate requirements from and design a solution to a real-world problem
	- plan and execute a small software development project in a team
	- apply skills from programming courses and other relevant courses in a project-like environment
	- learn new tools and APIs on his/her own

- Judgement and approach, the student should be able to:
	- reflect on the choice of software engineering methods used in the project

The [grading policy][grading] will be updated before the first lecture. The aim is to meet the requests from last year's course evaluation.

[grading]: https://github.com/hburden/DAT255/wiki/Grading-Policy

## Teachers
- Håkan Burden, hburden, [burden@cse.gu.se](mailto:burden@cse.gu.se), Lecturer
- Jan-Philipp Steghöfer, steghoja, [jan-philipp.steghofer@cse.gu.se](mailto:jan-philipp.steghofer@cse.gu.se), Examiner
- Rodi Jolak, rodijolak, Lecturer
- Daniel Sjölin, Lecturer


## Student Representatives
TBA


## Course Literature 
Book:
- Sommerville, I. (2010) *Software Engineering* (ISBN13: 9780137053469)

Vision:
- Writing a product vision: [1][pv1], [2][pv2].

Git:
- [Pro Git][GITBOOK], [Git Videos][gitvid]
- [A successful Git branching model][gitbranch]
- [GitHub Student Developer Pack](https://education.github.com/pack)
- Interactive Git learning: [Learn Git Branching][LearnGitBranching]

Android:
- [Design patterns explained with Android examples][AndroidPatterns]
- [Android tutorials](http://www.vogella.com/tutorials/android.html)
- [Android development tools and docs](http://developer.android.com/index.html)


## Schedule
Below you can see the time etc. of the lectures, exercises, workshops and deliverables. There is also a detailed schedule in [TimeEdit]. Note that the TimeEdit schedule contains all possible sessions, while the schedule below contains those that we actually use! 


If nothing else is stated, Håkan will be the lecturer on Mondays and Wednesdays and Rodi on Tuesdays.

| Week    | Date & Time | Room | Topic | Who | Deliverable(s) |
| 01 / 12 | Mar 21 13.15-15.00 | VasaC | Introduction | HB |  |


[timeedit]: https://se.timeedit.net/web/chalmers/db1/public/ri157XQQ709Z50Qv17003gZ6y6Y7006Q5Y61Y5.html
[GITBOOK]: http://git-scm.com/book
[gitvid]: http://git-scm.com/videos
[pv1]: http://www.scrumalliance.org/community/articles/2009/january/the-product-vision
[pv2]: http://www.joelonsoftware.com/articles/JimHighsmithonProductVisi.html
[gitbranch]: http://nvie.com/posts/a-successful-git-branching-model/
[LearnGitBranching]: http://pcottle.github.io/learnGitBranching/
[AndroidPatterns]: http://www.slideshare.net/PedroVicenteGmezSnch/software-design-patterns-on-android/

[xkcd]: http://xkcd.com/1425/
[COCO]: http://youtu.be/5HbYScltf1c

[L1]: https://github.com/hburden/DAT255/blob/master/Slides/L1-Introduction.pdf?raw=true
[L2]: https://github.com/hburden/DAT255/blob/master/Slides/L2-Project.pdf?raw=true
[L3]: https://github.com/hburden/DAT255/blob/master/Slides/L3-Scrum.pdf?raw=true
[L4]: https://github.com/hburden/DAT255/blob/master/Slides/L4-Testing.pdf?raw=true
[L5]: https://github.com/hburden/DAT255/blob/master/Slides/L5-Cybercom.pdf?raw=true
[L6]: https://github.com/hburden/DAT255/blob/master/Slides/L6-Design.pdf?raw=true
[L9]: https://github.com/hburden/DAT255/blob/master/Slides/L9-Reflection.pdf?raw=true

[L8]: https://github.com/morganericsson/DAT255/blob/master/slides/l8.pdf?raw=true
[PS]: https://github.com/morganericsson/DAT255/blob/master/presentations.md



[gittut]: https://www.atlassian.com/git/tutorials
[androidtut1]: https://github.com/morganericsson/DAT255/blob/master/tutorials/android1.md


## Examination
Every *group* should submit the following at the end of the course:

- Working app (APK incl. source code) that will be demonstrated at the project presentations. 
- Documentation (produced during the project):
	- Vision / Concept
	- A few user stories
	- Developer documentation (information relevant to people who work on the project) Suggestions:
		- How does the build process work
		- What major parts / components are there in the application
		- Design decisions (such as API level, etc.)
		- UML
		- Flowchart
		- Protocol (client/server )
		- External dependencies
		- Others that fit your project.
	- User manual
- [Post-mortem Report][pmr]

Note that the amount of documentation will vary depending on project, but *every group* **must** submit some documentation. If you are unsure about what to document, consult a supervisor.

Every *team member* should submit a brief evaluation of the members of the team, including themselves. Imagine that you have a budget of $10 per group member, including yourself (so, $50 for a group of 5). How would you distribute this "pay" among your group members, based on their value and contribution? Note that you are not allowed to pay everyone the same amount! Email your evaluation (name and amount for each group member *including* yourself) to burden@cse.gu.se no later than Oct 30 17:00. (The evaluation will not affect the group grade, it will only be used to determine individual variation within a group. However, if you do not submit this evaluation, you will not pass the course).

[pmr]: http://github.com/morganericsson/DAT255/wiki/Post-Mortem-Report


