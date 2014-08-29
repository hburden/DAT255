# DAT255, Software Engineering Project, 7.5 HEC, HT2014

## Course Description
Software remains malleable, often illogical, and incomplete forever. *Sequential approaches* to software development, such as the *waterfall model*, assumes that it is possible to take every single variable that could affect a project into account beforehand. Considerable effort is spent to identify risks, plan mitigation, and what consequences these may have. From a traditional product perspective, this can be compared to creating an assembly line to produce software.

Given the nature of software, is it really feasible to identify all variables beforehand? *Iterative and incremental approaches* accepts that changes are inevitable and integrates change management into the development process. *Agile approaches* promotes iterative and incremental development by using a very tight *design-code-test* cycle. If we again use a traditional product perspective, this can be compared to new product development.

## Learning outcomes
In this course you will learn how to design and develop software, and to manage projects, using the following agile principles:

- Creating value for an external customer 
- Incremental development 
- The developer should not be hindered by the process 
- Embrace changes 
- Continuous refactoring (restructuring) of the design
 
After passing the course, you will be able to lead agile projects, work without a detailed schedule, use test driven development, refactor programs, be part of a programming pair, and much more. 

## Teachers
- Håkan Burden (HB), [burden@cse.gu.se](mailto:burden@cse.gu.se) (lecturer)
- Morgan Ericsson (ME), [morgan@cse.gu.se](mailto:morgan@cse.gu.se) (examiner)
- Thomas Luvö (TL), tom@samoht.se (lecturer)

[Håkan Burden]: http://www.chalmers.se/en/staff/Pages/burden.aspx
[Morgan Ericsson]: http://www.chalmers.se/en/staff/Pages/moreri.aspx

## Supervisors

TBA

## Student Representatives

TBA

## Course Litteratur / Recommended reading
- Sommerville, I. (2010) *Software Engineering* (ISBN13: 9780137053469)
- [Pro Git][GITBOOK]
- Writing a product vision: [1][pv1], [2][pv2].
- [A successful Git branching model][gitbranch]
- Interactive Git learning: [Learn Git Branching][LearnGitBranching]

## Lectures and Tutorials
Below you can see the date, time, room and themes for the lectures. There is also a detailed schedule in [TimeEdit].

| Date & Time | Room(s) | Theme |Who | Slides |
|  ------	| :----:	| ------	| :------: |  :------: |
| 1/9 *15:15 - 17:00* | HA4 | **Introduction** | ME & HB | |
| 3/9 *10:00 - 11:45* | HC4 | **Intro to SICS** | SICS | |
| 8/9 *10:00 - 11:45* | HC4 | **Software Engineering** | ME & HB | |
| 10/9 *10:00 - 11:45* | HC4 | **Software Engineering (cont'd)** | ME & HB | |
| 15/9 *10:00 - 11:45* | HC4 | **AGA HMI** | SICS | |
| 17/9 *10:00 - 11:45* | HC4 | **AGA SDK** | SICS | |
| 22/9 *10:00 - 11:45* | HC4 | **TBD** | TL | |
| 24/9 *10:00 - 11:45* | HC4 | **TBD** | | |
| 29/9 *10:00 - 11:45* | HC4 | **TBD** | TL | |
| 1/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 6/10 *10:00 - 11:45* | HC4 | **AGA SDK** | SICS | |
| 8/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 13/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 15/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 20/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 22/10 *10:00 - 11:45* | HC4 | **TBD** | | |
| 24/10 *08.30 - 16:30* | Lindholmen | **Project presentations** | | |

[timeedit]: https://se.timeedit.net/web/chalmers/db1/public/ri157XQQ509Z50Qv17003gZ6y6Y7106Q5Y65Y5.html
[GITBOOK]: http://git-scm.com/book
[pv1]: http://www.scrumalliance.org/community/articles/2009/january/the-product-vision
[pv2]: http://www.joelonsoftware.com/articles/JimHighsmithonProductVisi.html
[gitbranch]: http://nvie.com/posts/a-successful-git-branching-model/
[LearnGitBranching]: http://pcottle.github.io/learnGitBranching/

## Examination
Every *group* should submit the following at the end of the course:

- Working app (APK) that will be demonstrated at the project presentations. Each team will either present 8.30-12.00 or 13.00-16.30. 
- Documentation (produced during the project):
	- Vision
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

Note that the amount of documentation will vary depending on project, but *every group* **must** submit some documentation. If you are unsure about what to document, consult your supervisor and check the sample project.

Every *person* should submit a brief evaluation of the group. Imagine that you have a budget of $10 per group member, not including yourself (so, $30 for a group of 4). How would you distribute this "pay" among your group members, based on their value and contribution? Note that you are not allowed to pay everyone the same amount! Email your evaluation (name and amount for each group member not including yourself) to morgan@cse.gu.se no later than XX 24:00. (The evaluation will not affect the group grade, it will only be used to determine individual variation within a group. However, if you do not submit this evaluation, you will not pass the course).

You can find more information about the [grading policy][grading] in the wiki.

[pmr]: http://github.com/morganericsson/DAT255/wiki/Post-Mortem-Report
[grading]: https://github.com/morganericsson/DAT255/wiki/Grading-Policy

## Sample project
To give you an idea of what a project might look like in the end, we've been authorised to publish this project which was made during the fall semester (2012). Note that this project is a regular Android app, so use it to get an idea about documentation and such.

[WatchMe for Android][WTCHME]

[WTCHME]: http://github.com/johanbrook/watchme
