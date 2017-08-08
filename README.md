# Course PM for Software Engineering Project (DAT255/DIT543) 7.5 HEC, Spring 2017

## News
- Aug 07: A first version of the course homepage is up and running. The homepage will be continuously edited, reflecting the evolution of the course.


## Course Description
Software remains malleable, often illogical, and incomplete forever. *Sequential approaches* to software development, such as the *waterfall model*, assumes that it is possible to take every single variable that could affect a project into account beforehand. Considerable effort is spent to identify risks, plan mitigation, and what consequences these may have. From a traditional product perspective, this can be compared to creating an assembly line to produce software.

Given the nature of software, is it really feasible to identify all variables beforehand? *Iterative and incremental approaches* accept that changes are inevitable and integrate change management into the development process. *Agile approaches* promote iterative and incremental development by using a very tight *design-code-test* cycle, mirroring the *plan-act-reflect* cycle of learning. The course design of DAT255 aims to tie the two cycles together so that the same process used for software development is applied to learning software engineering.

## Course Project
Most of the course time is spent on a course project. This term the project involves developing autonomous behaviour using miniature vehicles called [MOPED][MOPED]. In teams of 10-12 students you will develop the logic needed for simple platooning which will be demonstrated with the MOPEDs. Besides the platooning logic you will also need to handle sensor data, GUIs for visualising the state and behaviour of the individual vehicles and the protocol for transmitting signals between the vehicles and the remotes. 


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

Since a substantial part of the work is conducted in teams, please consider the [Chalmers rules regarding your work conditions][CRS]. If you encounter problems, contact Håkan immediately!

## Teachers

| ID | Name | Gitname | Contact | Role |
| ------ |  ------	| ------	| ------	| ------ | 
| HB | Håkan Burden | hburden | [burden@cse.gu.se / burden@chalmers.se](mailto:burden@cse.gu.se) | Course responsible |
| JS | Jan-Philipp Steghöfer | steghoja | [jan-philipp.steghofer@cse.gu.se](mailto:jan-philipp.steghofer@cse.gu.se) | Examiner |
| RJ | Rodi Jolak| rodijolak | | Lecturer |



## Student Representatives
Will be assigned at course start.

<!--
| Program | E-mail | Name | 
| ------  |  ------	                 | -----	     | 
| TKIEK   | oskarha@student.chalmers.se  | Oskar Hagman |
| TKIEK   | davhell@student.chalmers.se  | David Helldén |
| TKIEK   | henmar@student.chalmers.se   | Henrik Marklund |
| TKIEK   | teodorm@student.chalmers.se  | Teodor Martinsson |
| TKIEK   | tobsten@student.chalmers.se  | Tobias Stenshagen |
 
 We meet after the activities on Mar 22, Apr 26 and May 17. 
-->

## Course Literature 
Agile:
- Kniberg, H. (2015) [Scrum and XP from the Trenches - 2nd Edition](http://www.infoq.com/minibooks/scrum-xp-from-the-trenches-2). Free with registration
- [Breaking a feature into tasks](https://gojko.net/2012/01/23/splitting-user-stories-the-hamburger-method/)
- [Maintaining the full view of a complex system](http://jpattonassociates.com/the-new-backlog/)
- [Scrum of scrums](https://www.scrumalliance.org/community/articles/2007/may/advice-on-conducting-the-scrum-of-scrums-meeting)

Git:
- [Pro Git][GITBOOK], [Git Videos][gitvid]
- [A successful Git branching model][gitbranch]
- [GitHub Student Developer Pack](https://education.github.com/pack)
- Interactive Git learning: [Learn Git Branching][LearnGitBranching]

Business Model Canvas:
- A short [YouTube film](https://youtu.be/QoAOzMTLP5s)
- Wikipedia is a good [starting point](https://en.wikipedia.org/wiki/Business_Model_Canvas)

## Schedule
The details of the lectures, exercises, workshops and deliverables will be explained during the first lecture. As we strive to mirror the [TimeEdit] schedule, please inform us if you find any differences! 

| Week    | Date & Time        | Room  | Topic        | Who | Deliverable |
|  ------	| ------	| ------	| ------ |  ------ | ------ |
| 01 | Aug 28 *08:00-09:45* | HA4     | [Course introduction][L1] | HB |  |
|    | Aug 28 *10:00-11:45* | HC4     | [Jigsaw Kata][L2] | HB |  |
|    | Aug 29 *10:00-11:45* | EG-5215 | Git for newbies | RJ | |
|    | Aug 30 *10:00-17:00* | Mollgan | Lego Exercise | HB | D1 |
| 02 | Sep 04 *08:00-09:45* | HA4  | [Assessment & Scrum][L3] | HB |  |
|    | Sep 04 *10:00-11:45* | HC4  | [Project Introduction][L4] | Kenneth Lind |  |
|    | Sep 05 *10:00-11:45* | Lindholmen | Supervision          |              |  |
|    | Sep 06 *10:00-11:45* | HC4 | [Software quality][L5] | HB | D2 |
|    | Sep 07 *15:15-17:00* | HC4 | [MVP Exercise][L5] | HB | |
| 03 | Sep 12 *10:00-11:45* | Lindholmen | Supervision                |              |  |
|    | Sep 13 *10:00-11:45* | HC4 | Autonomous Systems | JS | |
| 04 | Sep 18 *10:00-11:45* | HC4 | Guest Lecture |  |  |
|    | Sep 19 *15:15-17:00* | Lindholmen | Supervision |  |  |
|    | Sep 20 *10:00-11:45* | HC4 | Guest Lecture |  | |
| 05 | Sep 25 *10:00-11:45* | HC4 | Guest Lecture |  |  |
|    | Sep 26 *15:15-17:00* | Lindholmen | Supervision | | D3 |
|    | Sep 27 *10:00-11:45* | HC4 | Guest Lecture |  |  |
| 06 | Oct 03 *15:15-17:00* | Lindholmen | Supervision | |  |
| 07 | Oct 10 *15:15-17:00* | Lindholmen | Supervision | | |
|    | Oct 11 *10:00-11:45* | HC4 | Reflections | HB | |
| 08 | Oct 19 *15.00-17.00* | Lindholmen | Final Presentation | | D4 |
| 09 | Oct 27 *17:00*       |            | Sign Off | | D5 |



## Examination
The individual grades are based on the team contribution. Contribution is in turn defined according to *Stakeholder value*, *Protoype* and *Reflection report*. Each category represents a certain number of points so that the total number of points sums to 50. The points are not evenly distributed across the categories since the assessment occurs at different points in time and represent different efforts.

### Pass / Fail
To pass the course **each team** has to deliver:

- D1: One or two pages drawing on the lessons from the Lego scrum exercise on how to initially work with scrum. Describe three strategies for improving how you implement Scrum in your project, based on the experiences from the LEgo exercise. A strategy can be that you want to do more or less of a practice, or that you want to change how you applied a practice. Mention why you chose the strategy and how the strategy will be implemented. For each strategy, select a KPI that will enable you to monitor your progression. We also want a [social contract][socialcontract] for the team. Both the scoial contract and the strategies with KPIs should be uploaded to the team git repo before SEP 01 CET 17:00. The strategies with KPIs should also be e-mailed to Håkan before SEP 01 CET 17:00 since these will be used as examples in the following lecture.

- D2: Define an initial product backlog that can contain epics but should have enough user stories to cover the first sprint. E-mail an invitation to your backlog to both Jan-Philipp and Håkan before SEP 06 CET 17:00. You are free to choose any scrum board technology you want but make sure you can share it. The reason for the immediate deadline is that we will give collective feedback on the backlogs at the next lecture. Also, create an initial business model for your system. The business model should be uploaded to the team git repo before SEP 08 CET 17:00.

- D3: Half-time evaluation which is a one-page document reflecting on the work so far, both in terms of process and product. D3 should be uploaded to the git repo before the supervision on SEP 26.

- D4: The fourth deliverable is a *working prototype* for the final presentation. All artefacts relevant to D4 should be uploaded to the git repo before the final presentation.
- D5: The last deliverable consists of the output from [gitinspector][GitInspector] as well as the [Reflection Report](### Reflection Report).

within the designated deadlines.

To pass the course **a student** has to deliver:
- evidence for active participation in the team effort. The level of student participation is determined on a combined assessment of the output from [gitinspector][GitInspector] and the mean values from the team evaluation. 
- an evaluation of the members of the team, including themselves. Imagine that you have a budget of $10 per group member, including yourself (e.g. $50 for a group of 5 or $120 for a group of 12). How would you distribute this "pay" among your group members, based on their value and contribution? Submit your evaluation using our [new online web survey][PersonalSurvey] before . (The evaluation will not affect the group grade, it will only be used to determine individual variation within a group. However, if you do not submit this evaluation, you will not pass the course).

within the designated deadline

### Stakeholder value, 12p
The stakeholder value is assessed during the final presentation. The total score is the sum of
- Completeness (prioritised features in backlog are present, one application and stable operation)
- GUI (self-explanatory for intended users, clarity and no excess information) 
- Relevance (efficiency and clear relation to problem domain)
- Acceptance tests and stakeholder interaction

Each part is worth 0-3 points where 0 represents failed delivery, 1 equals major remarks, 2 signifies minor remarks and 3 no remarks. 

### Prototype, 15p
All artefacts related to the prototype should be in the Git repository. These will be assessed after the final deadline of the course. 
- Code quality, 3p. Code quality is based on the verdict of an automated analysis of the source code, such as [FindBugs][FindBugs]. If Findbugs is not appropriate for your project you can talk to Håkan or Jan-Philipp about alternative tools. Given Findbugs the sum of issues gives the number of points for code quality, so that
  - 0-5 = 3p
  - 5-10 = 1p
  - &gt;10 = 0p, where the impact of each kind of *Correctness issues* counts as 4,  *Bad style* as 2,  *Dodgy* as 2  and *Performance* as 1. Each team is responsible for uploading the FindBugs report (or similar) to their repository. 
- Unit / integration / system tests, 3p
- Design rationale (choice of API-level, external dependencies, database structure etc.), 3p
- Overview, 3p
  - Behavioural
  - Structural (What major parts / components are there in the application)
  - Protocol (client/server) 
- User stories, 3p 

Each part worth 3 points has an allocation strategy where 0 represents failed delivery, 1 equals major remarks, 2 signifies minor remarks and 3 no remarks. 

### Reflection report, 23p
The reflection report is also uploaded to the git repository as a PDF-file. It will be assessed after the final deadline of the course.
- Application of scrum
  - Roles, team work and social contract (relates to D1B)
  - Used practices (pair programming, stand-up meetings, etc.)
  - Time distribution (person / role / tasks etc.)
  - Effort and velocity and task breakdown
- Reflection on the sprint retrospectives
- Documentation of sprint retrospectives, 0-1p
- Reflection on the sprint reviews
- Best practices for using new tools and technologies
- Reflection on the relationship between *prototype*, *process* and *stakeholder value*
- Relating your own process to literature and guest lectures
- Evaluation of D1 - D4
- KPI charts, 0-1p 

Each part worth 3 points has an allocation strategy where 0 represents failed delivery, 1 equals major remarks, 2 signifies minor remarks and 3 no remarks. Including sprrint retrospectives for all sprints gives 1 point, including the burn-down chart is also worth 1 point.

Reflection is here defined as *“assessment of what is in relation to what might or should be and includes feedback designed to reduce the gap”* (R. Smith. Formative Evaluation and the Scholarship of Teaching and Learning. *New Directions for Teaching and Learning*, vol. 88, 2001, pp. 51-62). This means that you should describe the situation as it is, what you would like it to be (or alternative routes you could have taken) as well as a realistic way to get there.


### Grades
The team grade is given by the total number of points for the team effort:
- 00 - 20: U (Fail)
- 21 – 30: 3 / G (Pass)
- 31 – 40: 4
- 41 – 50: 5 / VG

The team grade then serves as a baseline for the individual grades so that students with higher contributions **and** team effort receive a higher grade than the team grade and students with lower individual scores receive a lower grade. Higher and lower are approximately 25% more / less than team average. *Please use the [online survey][PersonalSurvey] to assess your own and your team mates contribution*. And remember to include yourself!

We strive for a transparent and fair assessment strategy. [That is why we as teachers are the ones that do the grading based on our experience][fairgrades].

[timeedit]: https://se.timeedit.net/web/chalmers/db1/public/ri157XQQ709Z50Qv17003gZ6y6Y7006Q5Y61Y5.html
[GITBOOK]: http://git-scm.com/book
[gitvid]: http://git-scm.com/videos
[gitbranch]: http://nvie.com/posts/a-successful-git-branching-model/
[LearnGitBranching]: http://pcottle.github.io/learnGitBranching/
[AndroidPatterns]: http://www.slideshare.net/PedroVicenteGmezSnch/software-design-patterns-on-android/
[FindBugs]: http://findbugs.sourceforge.net/
[GitInspector]: https://github.com/ejwa/gitinspector
[PersonalSurvey]: https://goo.gl/forms/3xPs53HGpCUtIa3S2
[socialcontract]: http://www.agileacademy.com.au/agile/sites/default/files/Social%20Contract%202011.pdf
[L1]: https://github.com/hburden/DAT255/blob/master/Slides/L1-Introduction.pdf?raw=true
[L2]: https://github.com/hburden/DAT255/blob/master/Slides/L2-Lego.pdf?raw=true
[L3]: https://github.com/hburden/DAT255/blob/master/Slides/L3-AssessmentScrum.pdf?raw=true
[L4]: https://github.com/hburden/DAT255/blob/master/Slides/L4-Kata.pdf?raw=true
[L5]: https://github.com/hburden/DAT255/blob/master/Slides/L5-SoftwareQuality.pdf?raw=true
[L6M]: https://github.com/hburden/DAT255/blob/master/Slides/L6-ProjectMotivation.pdf?raw=true
[L6S]: https://github.com/hburden/DAT255/blob/master/Slides/L6-ProjectSystem.pdf?raw=true
[L7E]: https://github.com/hburden/DAT255/blob/master/Slides/L7-ScrumRevisited.pdf?raw=true
[L7F]: https://github.com/hburden/DAT255/blob/master/Slides/L7-Feedback.pdf?raw=true
[L7]: https://www.slideshare.net/secret/3wOZUPV5h15mHg
[L8]: https://github.com/hburden/DAT255/blob/master/Slides/L8-Spotify.pdf?raw=true
[L9]: https://github.com/hburden/DAT255/blob/master/Slides/L9-IDGB.pdf?raw=true
[PS]: https://github.com/morganericsson/DAT255/blob/master/presentations.md
[CRS]: https://student.portal.chalmers.se/sv/chalmersstudier/regelsamling/Sidor/regelsamling.aspx
[gittut]: https://www.atlassian.com/git/tutorials
[fairgrades]: http://www.cse.chalmers.se/~burden/pdfs/BurdenHeldalAdawi.pdf
[FAQ]: http://github.com/hburden/DAT255/wiki/FAQ
[VAMap]: http://visualarena.lindholmen.se/
[LHMap]: http://maps.chalmers.se/#edae38d5-8eb0-44d2-9afb-dcaf6cf049ea
[Mållgan]: https://github.com/hburden/DAT255/blob/master/Extras/Mållgan.jpg?raw=true
[Navet]: https://github.com/hburden/DAT255/blob/master/Extras/Navet.jpg?raw=true
[MOPED]: https://github.com/sics-sse/moped
