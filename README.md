# Course PM for Software Engineering Project (DAT255/DIT543) 7.5 HEC, Spring 2018

The course has been updated with new Intended Learning Objectives and has subsequently been given a new course code. The new course has its own repo, [DAT256](https://github.com/hburden/DAT256).

## News
- May 22: Here are two scenarios for tomorrow's final presentation. Some teams will be active in both scenarios while some teams are only participating in one scenario, the actors in each scenario are highlighted in the beginning of the document: [Scenario1] and [Scenario2]
- Mar 27: Added some material under Course Literature that was recommended by the Product Owners to better understand the shipping industry and how IT is changing the business  
- Mar 23: There is now a [Slack channel](https://join.slack.com/t/dat255group/shared_invite/enQtMzM0NTYxMDEwNjQ2LTllNWQ5YWE2Y2I2YTFlZjY4YTIzZThjNWM0OWQ3NjQyOGZkMmJmYzhlNTI3ZWNjMTA2YjE5Nzc5ZTY0MDNlYTg)  for the course. The channel can be used for asking questions to the teachers, collaborating across teams, looking for team members or a team but also for technical support after Easter.
- Mar 21: Today the student office assigned student representatives, please check below for further information 
- Mar 21: Today we have the Lego Scrum Exercise and in order to better understand if the exercise supports the intended learning objectives we would like you to fill out a [survey](https://goo.gl/forms/1l3nlWcLZMjSnJLz1) *after the exercise*
- Mar 15: The schedule is now updated with content for the lectures. This was unfortunately delayed due to having to negotiate  meetings at other locations, sorry for this. The slides are tentative and there to indicate the content of each lecture, they will most probably be updated the same day as the lecture to accommodate changes conducted for this course instance. 
- Mar 02: In comparison to the last iteration of the course we have changed the examination to better reflect the learning objectives and changed the topic of the project. The examination is now clearly split into individual and team assessment, has a stronger focus on how to learn new technologies (from experience the most challenging learning objective) and has the same structure throughout the course (instead of varying over weeks). The topic this time will be manintenance and evolution of maritime IT applications instead of development of autonomous vehicles. 
- Mar 02: A first version of the course homepage is up and running. The homepage will be edited as the course evolves but Learning outcomes, Literature and Examination will stay as they are

## Course description
The course consists of two phases. The first phase consists of three weeks and is used to introduce the course topics through lectures and exercises. During the first week the students form a scrum development team. The second phase consists of six weeks and centres around weekly supervision. During this phase the teams work together to develop applications for a specific purpose. Through guest lectures the students are given the opportunity to reflect on how their own work relates to what professional software engineers do and to put their own experiences into a bigger picture. The second phase finishes with a final presentation the week for the examination week. The examination week can be used for writing the final reflection. 

The majority of the course work is done in project teams. The topic this time is within maritime IT and the case is to tailor a generic app for the specific needs and wishes of one of the actors operating in a port. The existing application can be found both on [Google Play](https://play.google.com/store/apps/details?id=se.viktoria.portablecdm&hl=en) and the [App Store](https://itunes.apple.com/US/app/id1278240361?mt=8). There is also a [description of how to configure and use the app][AppMan]. The source code of the app can be forked from the [github repo](https://github.com/avajadi/portablecdm). There is a sandboxed backend, `http://sandbox-6.portcdm.eu`, that you can use for storing and retrieving data during the course. To give you an initial idea of the needs and wishes of the actors there is a [scenario][scenario] that describes typical port operations and their dependencies. The aim is to have ten teams so you will be approximately eight students per team. 

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
| ------ |  ------      | ------        | ------        | ------ | 
| HB | Håkan Burden | hburden | [burden@chalmers.se](mailto:burden@chalmers.se) | Course responsible |
| JS | Jan-Philipp Steghöfer | steghoja | [jan-philipp.steghofer@cse.gu.se](mailto:jan-philipp.steghofer@cse.gu.se) | Examiner |
<!-- | RJ | Rodi Jolak| rodijolak | -- | Teaching Assistant | -->



## Student Representatives

| Program | E-mail | Name | 
| ------  |  ------                      | -----             | 
| TKIEK   | johneri@student.chalmers.se     | JOHN ERIKSSON |
| TKIEK   | rebhje@student.chalmers.se      | REBECCA HJERTONSSON |
| TKIEK   | mhult@student.chalmers.se       | MATTIAS HULT |
| TKIEK   | marmarkl@student.chalmers.se    | MARTIN MARKLUND |
| TKIEK   | konradm@student.chalmers.se     | KONRAD MORZKOWSKI |

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

Vision:
- The Scrum Alliance view on [visions][pv1] 
- Jim Highsmith's view on product [visions][pv2]
<!--Business Model Canvas:
- A short [YouTube film](https://youtu.be/QoAOzMTLP5s)
- Wikipedia is a good [starting point](https://en.wikipedia.org/wiki/Business_Model_Canvas)-->

Maritime IT:
- [The case where less optimal operations lead to better efficiency](https://fathom.world/case-less-optimal-operations-lead-better-efficiency/)
- [Is it too late for shipping to collaborate to improve?](https://fathom.world/late-shipping-collaborate-improve/)
- [Who controls the optimisation button?](https://fathom.world/controls-optimisation-button/)
- [Ports, Walmart and the Tragedy of the Commons](https://fathom.world/ports-walmart-tragedy-commons/)
- [Proving that port-to-port communication can save shipowners money](https://fathom.world/proving-port-port-communication-can-save-shipowners-money/)
- [Global port operations can save up to $12bn annually with better communication](https://fathom.world/12bn-global-port-savings/)
- [Shipping Podcast](https://shippingpodcast.com/introduction/) by Lena Göthberg 
        - The Port CDM group made a map of all stakeholders involved in a port call, they call it [the metro-map](https://shippingpodcast.com/mikael-lind-associate-professor-research-institutes-sweden-rise-viktoria/), you can find it on the Facebook page of the Shipping Podcast. When looking at the #metromap it becomes obvious that if all parties involved had the same information about what and when things will happen, a lot of time will be saved. And time is money.
        - Professor [Richard Watson](https://shippingpodcast.com/professor-richard-watson/) is world famous internet strategist. He is currently researching ecological sustainability, energy informatics and information system leadership. As Richard is a teacher, we deviate into other areas, which he can explain so easily and pedagogically, we speak about the Business Model You, which we can highly recommend, download the pdf and start cracking! Richard gives a lot of good examples from other industries which has already managed to transform themselves into a service business, where he thinks that the shipping industry has to go. He gives 4 value propositions for the industry and he explains that shipping is a complex adaptive system.



## Schedule
The details of the lectures, exercises, workshops and deliverables will be explained during the first lecture. As we strive to mirror the [TimeEdit] schedule, please inform us if you find any differences! 

| Wk     | Date & Time          | Room       | Topic  | 
| ------ | ------               | ------     | ------ |  
| 01     | Mar 19 *13:15-15:00* | VasaC      | [Course introduction][L1] | 
|        | Mar 19 *15:15-17:00* | VasaC      | [Kata][L2p] & [Template][L2t] | 
|        | Mar 21 *13:15-17:00* | VasaC      | [Lego Exercise][L3] | 
|        | Mar 23 *13:15-15:00* | VasaC      | [Scrum][L4] | 
| 02     | Mar 26 *13:15-15:00* | VasaC      | [Software quality][L5] | 
|        | Mar 28 *13:15-15:00* | VasaC      | [Project Introduction][L6]   | 
| 03     | Apr 09 *13:15-15:00* | VasaC      | [MVP Exercise][L7] | 
|        | Apr 11 *13:15-17:00* | Lindholmen | Supervision | 
|        | Apr 13 *13:15-15:00* | VasaC      | Guest lecture |
| 04     | Apr 18 *13:15-17:00* | Lindholmen | Supervision | 
| 05     | Apr 25 *13:15-17:00* | Lindholmen | Supervision | 
| 06     | May 02 *13:15-17:00* | Lindholmen | Supervision | 
| 07     | May 09 *13:15-17:00* | Lindholmen | Supervision | 
| 08     | May 16 *13.15-17.00* | Lindholmen | Supervision |  
| 09     | May 23 *08:00-12:00* | Lindholmen | Final presentation |
| 10     | Jun 01 *17:00*       |            | Sign Off | 

## Examination
The assessment is done on both individual and team level. The assessment is done in terms of reflecting on pre-defined topics. Smith states that reflection is "assessment of what is in relation to what might or should be and includes feedback designed to reduce the gap" (R. Smith, *Formative Evaluation and the Scholarship of Teaching and Learning*, New Directions for Teaching and Learning, vol. 88, 2001, pp. 51-62) which can be boiled down to describing ...  
... the current situation (A),  
... what you want the situation to be (B), and  
... a plan for getting from where you are to where you want to be (A -> B).

Each step is worth one point per topic, so that the maximum points for a topic is 3. But you can only score a point for a step if you received a point for the previous step(s). This means you get 0 points for only describing where you want to be since you don't have a point for describing the current situation. That also means that you can not reflect in week n if you have not recorded a reflection for week n-1, since this means that the chain of reflection is broken. We will only assign points to the last iteration (week 9) which should summarise and synthesise the learning from the previous iterations ("what is"), describe what you would like to do in a similar future project ("what might or should be") and how you can make the change come true ("feedback designed to reduce the gap").

As an individual you will upload a text document to the team repository where you each week reflect on the following questions
- what do I want to learn or understand better?
- how can I help someone else, or the entire team, to learn something new?
- what is my contribution towards the team’s application of scrum?
- what is my contribution towards the team’s deliveries?

That means that for the personal learning objective you will each week write down what you have achieved in relation to last week's ambition (technologies, concepts and skills learnt as well as how this was achieved), what you would like to achieve for the next week and how to make the change happen. The first week of the course you describe the current situation by motivating a learning objective. It is perfectly fine to change objective/s each week as long as you can motivate the change and you evaluate the outcome of the previous week (e.g. describing the current situation).

As a team you should reflect on the following topics:
- the chosen scope of the application under development including priority of features and for whom you are creating value
- your social contract, which means you should create one in the first week 
- the success criteria for the team in terms of what you want to achieve with your application
- your acceptance tests, such as how they were performed and with whom
- the design of your application (choice of APIs, architecture patterns etc)
- the behavioural overview of your application (for instance through use cases, interaction diagrams or similar)
- the structural overview of your application (such as class diagrams, domain models or component diagrams)
- your user stories in terms of using a standard pattern, acceptance criteria, task breakdown and effort estimation
- the three KPIs you use for monitoring your progress
- code quality using a tool such as Findbugs (1 point if your code includes issues concerning correctness or bad style, 2 points if you have dodgy or performance issues and 3 points if the code is fine), only asses the code you have written yourself
- the roles you have used within the team 
- the agile practices you have used for the current sprint
- the time you have spent on the course (so keep track of your hours so you can describe the current situation)
- the sprint review (either in terms of outcome of the current week's exercise or meeting the product owner)
- best practices for using new tools and technologies (IDEs, version control, scrum boards etc.)
- relation to literature and guest lectures (how do your reflections relate to what others have to say?)

The total for the team is then 16*3 = 48 but each team gets two additional points if all team members have completed their individual reflections, so that the total = 50.
The team grade is then computed so that a total score within the range 
00 - 20 = U (fail)
21 - 30 = 3 or G (pass)
31 - 40 = 4
41 - 50 = 5 or VG (pass w. distinction)

The individual grade is then based on the individual reflections, the outcome of analysing the contribution towards the team repository (for instance by [gitinspector][GitInspector]) and the outcome of the [peer assessment][PeerAssessment]. If the team has been awarded a grade for the course and there is a weekly individual reflection the grade of each team member can then be lowered or raised if both repository analysis and the peer assessment indicate a difference of 25% or more compared to the team mean. This means that in a team of six team members, receiving the team grade 4 where someone is responsible for 20% of the code and scored 14 out of 20 on the peer assessment, will get the individual grade 5. Conversely, a team of six with the team grade 3 where a team member committed 5% of the code and scored a mean of 7 out of 20 from peer assessment, will be failed.

We strive for a transparent and fair assessment strategy. [That is why we as teachers are the ones that do the grading based on our experience][fairgrades].

[timeedit]: https://se.timeedit.net/web/chalmers/db1/public/ri157XQQ709Z50Qv17003gZ6y6Y7006Q5Y61Y5.html
[GITBOOK]: http://git-scm.com/book
[gitvid]: http://git-scm.com/videos
[gitbranch]: http://nvie.com/posts/a-successful-git-branching-model/
[LearnGitBranching]: http://pcottle.github.io/learnGitBranching/
[AndroidPatterns]: http://www.slideshare.net/PedroVicenteGmezSnch/software-design-patterns-on-android/
[FindBugs]: http://findbugs.sourceforge.net/
[GitInspector]: https://github.com/ejwa/gitinspector
[PeerAssessment]: https://goo.gl/forms/3xPs53HGpCUtIa3S2
[socialcontract]: http://www.agileacademy.com.au/agile/sites/default/files/Social%20Contract%202011.pdf
[L1]: https://github.com/hburden/DAT255/blob/master/Slides/L1-Introduction.pdf?raw=true
[L3]: https://github.com/hburden/DAT255/blob/master/Slides/L3-Lego.pdf?raw=true
[L4]: https://github.com/hburden/DAT255/blob/master/Slides/L4-Scrum.pdf?raw=true
[L2p]: https://github.com/hburden/DAT255/blob/master/Slides/L2-Kata.pdf?raw=true
[L2t]: https://github.com/hburden/DAT255/blob/master/Extras/KataTest.pptx?raw=true
[L5]: https://github.com/hburden/DAT255/blob/master/Slides/L5-SoftwareQuality.pdf?raw=true
[L6]: https://github.com/hburden/DAT255/blob/master/Slides/L6-Project.pdf?raw=true
[L7]: https://github.com/hburden/DAT255/blob/master/Slides/L7-MVP.pdf?raw=true
[L6M]: https://github.com/hburden/DAT255/blob/master/Slides/L6-ProjectMotivation.pdf?raw=true
[L6S]: https://github.com/hburden/DAT255/blob/master/Slides/L6-ProjectSystem.pdf?raw=true
[L7E]: https://github.com/hburden/DAT255/blob/master/Slides/L7-ScrumRevisited.pdf?raw=true
[L7F]: https://github.com/hburden/DAT255/blob/master/Slides/L7-Feedback.pdf?raw=true
[L7]: https://www.slideshare.net/secret/3wOZUPV5h15mHg
[L8]: https://github.com/hburden/DAT255/blob/master/Slides/L8-Adaptive-Systems.pdf?raw=true
[L9]: https://github.com/hburden/DAT255/blob/master/Slides/L9-Zenuity.pdf?raw=true
[L10]: https://github.com/hburden/DAT255/blob/master/Slides/L10-IGDB.pdf?raw=true
[L11]: https://github.com/hburden/DAT255/blob/master/Slides/L11-CM.pdf?raw=true
[L12]: https://github.com/hburden/DAT255/blob/master/Slides/L12-Reflections.pdf?raw=true
[PS]: https://github.com/morganericsson/DAT255/blob/master/presentations.md
[CRS]: https://student.portal.chalmers.se/sv/chalmersstudier/regelsamling/Sidor/regelsamling.aspx
[gittut]: https://www.atlassian.com/git/tutorials
[fairgrades]: http://www.cse.chalmers.se/~burden/pdfs/BurdenHeldalAdawi.pdf
[FAQ]: http://github.com/hburden/DAT255/wiki/FAQ
[VAMap]: http://visualarena.lindholmen.se/
[LHMap]: http://maps.chalmers.se/#edae38d5-8eb0-44d2-9afb-dcaf6cf049ea
[Mållgan]: https://github.com/hburden/DAT255/blob/master/Extras/Mållgan.jpg?raw=true
[Navet]: https://github.com/hburden/DAT255/blob/master/Extras/Navet.jpg?raw=true
[AppMan]: https://github.com/hburden/DAT255/blob/master/Extras/AppMan.pdf?raw=true
[MOPED]: https://github.com/sics-sse/moped
[pv1]: http://www.scrumalliance.org/community/articles/2009/january/the-product-vision
[pv2]: http://www.joelonsoftware.com/articles/JimHighsmithonProductVisi.html
[scenario]: https://github.com/hburden/DAT255/blob/master/Extras/Scenario.pdf?raw=true
[Scenario1]: https://github.com/hburden/DAT255/blob/master/Extras/Scenario1_VT-2018.pdf?raw=true
[Scenario2]: https://github.com/hburden/DAT255/blob/master/Extras/Scenario2_VT-2018.pdf?raw=true

