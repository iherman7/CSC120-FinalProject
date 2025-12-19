# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`

 Design justification: Being inspired by zork as the model for a text based game we eneded up with the caridnal sytem of going north, south, east, or west. We considered having other ways of movement like left or right, but figure it would make things too complicated and NSEW had for the most part accomplished what we needed the charcater to do. We considered different things within our design, like figuring out how to parse the user's input and using that to inform our output, but we did not have the time to do that and we instead tried to encompass different ways a user might respond in each situation and allow them to try again if it doens't match a case we have provided in the code. having each location be designated as a coordinate from a map that we created before coding was very helpful for orginization along with allowing the method names in each location to be the name of the coordinate so we can check within the game loop if the method and the location matches. we though about different ways to do the riddles--like have the code reas of a file, but in the end decied against that. We have all the challenges and conditions needed to move the game along in skeem which is was very easy to check and set what conditions we have and to not have them instead created in each location. The system we created was over simple enough and replicable in each location
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
 - What **new thing(s)** did you learn / figure out in completing this project?
 - Is there anything that you wish you had **implemented differently**?
 - If you had **unlimited time**, what additional features would you implement?
 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
