# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`

## Design Justification: 

 Being inspired by zork as the model for a text based game we eneded up with the cardinal sytem of going north, south, east, or west. We considered having other ways of movement like left or right, but figure it would make things too complicated and NSEW had for the most part accomplished what we needed the charcater to do. We considered different things within our design, like figuring out how to parse the user's input and using that to inform our output, but we did not have the time to do that and we instead tried to encompass different ways a user might respond in each situation and allow them to try again if it doens't match a case we have provided in the code. having each location be designated as a coordinate from a map that we created before coding was very helpful for orginization along with allowing the method names in each location to be the name of the coordinate so we can check within the game loop if the method and the location matches. we though about different ways to do the riddles--like have the code reas of a file, but in the end decied against that. We have all the challenges and conditions needed to move the game along in skeem which is was very easy to check and set what conditions we have and to not have them instead created in each location. The system we created was simple enough and easy to replicate in each location.
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?

Our overall approach was very location-based. Creating our map was one of the first things we did, so our code reflects this focus. Each of the locations had a unique challenge and/or a unique character to interact with, so we made sure that the code for each of the location classes were easy to replicate and functional throughout the game. The game loop runs entirely on the basis of the player's location because of this initial approach. Tracking the player's progress in other ways is handled in the skeem class, which was secondary to our design.

 - What **new thing(s)** did you learn / figure out in completing this project?

We learned a lot about object oriented programming. We implemented concepts like utilizing accessors and manipulators often, as well as passing information between classes. We had to learn a lot about static/non-static methods and general coding logic in order to complete the game.

 - Is there anything that you wish you had **implemented differently**?

We wish we had implemented some of the location features differently. It became difficult when multiple "scenes" of the game occurred at one static location, or when the player wanted to return to the same location twice. We could have implemented a better system to track the location of the player in order to solve this issue.

 - If you had **unlimited time**, what additional features would you implement?

We would have implemented a better way to parse user input. The current input options are quite limited and mostly based on cardinal directions except in specific cases. We had to predict what the user might want to say at each location, but with a better system we could have used verbs and nouns to give the user more freedom in their inputs, making the game overall easier to play.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?

Some of the most difficult problems were solved simply by explaining our bugs to one another. We helped each other with logical issues through talking it out or drawing it out. Often, there was just a small syntax error or logical error that became obvious when we explained the issue to one another.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?

We would advise our past selves to plan ahead for potential problems before jumping straight in to the code. Some of the earlier iterations of code had to be scrapped since we ran into roadblocks later on. We could have tested the code early on in order to avoid these mistakes.

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.

Working as a pair was overall an enjoyable experience. It was helpful to divide up the workload, and we helped each other figure out issues along the way. Working with github was relatively simple, but we had to keep our communication very clear throughout the process in order to avoid merge issues. Overall, we were able to make the project more complex, detailed, and creative because we had two perspectives to work out problems and come up with ideas.
