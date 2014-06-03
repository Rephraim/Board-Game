Option a = new Option("How about no?", "happiness +10, academics -2", 0, 0, 10, -2);
Option b = new Option("Not too many…", "academics +2", 0, 0, 0, 2);
Option c = new Option("Six. AP gov/econ!!!", "happiness -5, academics +4", 0, 0, -5, 4);
Event e = new Event("First day of school! How many AP classes are you taking?", a, b, c, true);
events.add(e);

a = new Option("Oh wait, its not Wednesday.", "tardies +1", 1, 0, 0, 0);
b = new Option("Loving the late start.", "happiness +3", 0, 0, 3, 0);
c = new Option("Meeeeeeeeh, school.", "tardies +1, happiness -2", 1, 0, -2, 0);
e = new Event("8 AM, waking up in the morning. Gotta be fresh, gotta go downstairs.", a, b, c, true);
events.add(e);

a = new Option("Bagel sandwiches.", "tardies +1, $$$ -3, happiness +5", 1, -3, 5, 0);
b = new Option("Chipotle.", "tardies +1, $$$ -5, happiness +5", 1, -5, 5, 0);
c = new Option("Eastern Winds.", "tardies +1, $$$ -4, happiness +5", 1, -4, 5, 0);
e = new Event("You’ve been craving _______________, so you go out to lunch.  As a result you are late to fifth period.", a, b, c, true);
events.add(e);

a = new Option("Hell yeah!", "$$$ -10, happiness +10", 0, -10, 10, 0);
b = new Option("Nah, too expensive.", "happiness -2", 0, 0, -2, 0);
c = new Option("I think I’ll go to Berkeley instead.", "tardies +1, $$$ -5, happiness +5", 1, -5, 5, 0);
e = new Event("All your friends are going to Waterworld.  Are you?", a, b, c, true);
events.add(e);

a = new Option("cram it in during read.", "happiness -3, academics -2", 0, 0, -3, -2);
b = new Option("ask the teacher for an extension.", "academics -5", 0, 0, 0, -5);
c = new Option("screw it and play League instead.", "happiness +5, academics -10", 0, 0, 5, -10);
e = new Event("Oh no...You forgot to do that one assignment worth 20% of your grade. You...", a, b, c, true);
events.add(e);

a = new Option("Yes.", "happiness -10", 0, 0, -10, 0);
b = new Option("...yes.", "happiness -15", 0, 0, -15, 0);
c = new Option("Ohlone for lifeeee.", "happiness +5, academics -5", 0, 0, 5, -5);
e = new Event("College applications... do I have to? :(", a, b, c, true);
events.add(e);

a = new Option("Whoo, free money!", "$$$ +5, happiness +2", 0, 5, 2, 0);
b = new Option("Time to turn it in to Brandy.", "$$$ +2, happiness +3", 0, 2, 3, 0);
c = new Option("Leave it.", "happiness -2", 0, 0, -2, 0);
e = new Event("Hey... there’s a five on the ground!", a, b, c, true);
events.add(e);

a = new Option("Sick as a dog.", "tardies +5, happiness -2, academics -2", 5, 0, -2, 2);
b = new Option("Loving the "midterm flu".", "tardies +5, academics +3", 5, 0, 0, 3);
c = new Option("Party in LA!", "tardies +5, academics -3", 5, 0, 0, -3);
e = new Event("You’ve been down with the flu for a week.", a, b, c, true);
events.add(e);

a = new Option("Yeah.", "$$$ -10, happiness +10", 0, -10, 10, 0);
b = new Option("Nah, stag 5 life!!!", "$$$ -5, happiness +5", 0, -5, 5, 0);
c = new Option("No, gotta stay home and study.", "happiness -3, academics +3", 0, 0, -3, 3);
e = new Event("Brace yourself. Winter ball is coming!  Got a date?", a, b, c, true);
events.add(e);

a = new Option("Obviously.", "$$$ -3, happiness +5", 0, -3, 5, 0);
b = new Option("No, I can’t miss class.", "happiness -2, academics +3", 0, 0, -2, 3);
c = new Option("Heck no, Compsci field trip that day!", "#brucker4lyfe $$$ -3, happiness +7", 0, -3, 7, 0);
e = new Event("Economics field trip! Do you go?", a, b, c, true);
events.add(e);

a = new Option("Jerry Wu.", "He has candy. $$$ +1", 1, 0, 0, 0);
b = new Option("Werry Ju.", "happiness +2", 0, 0, 2, 0);
c = new Option("Vote Radical!", "happiness +5", 0, 0, 5, 0);
e = new Event("Time for Mock Con! Who do you vote for?", a, b, c, true);
events.add(e);

a = new Option("Bust your tailbone.", "#ffang #QQ happiness -5", 0, 0, -5, 0);
b = new Option("Have the time of your life.", "happiness +10, academics -3", 0, 0, 10, -3);
c = new Option("Crash into a tree. Ow.", "happiness -10", 0, 0, -10, 0);
e = new Event("During winter break you go skiing and...", a, b, c, true);
events.add(e);

a = new Option("Last minute college apps!", "happiness -2, academics +3", 0, 0, -2, 3);
b = new Option("Finish a ton of DeviantArt commissions.", "#terri happiness + 3, $$$ + 5, academics -3", 0, 5, 3, -3);
c = new Option("Flappy Bird!", "happiness -2, academics -3", 0, 0, -2, -3);
e = new Event("Winter break is for..?", a, b, c, true);
events.add(e);

a = new Option("#SSS", "tardies +3, happiness +5", 3, 0, 5, 0);
b = new Option("So muuuuuuch woooooork.", "happiness -3", 0, 0, 3, 0);
c = new Option("New found hate for projects.", "happiness -3, academics -3", 0, 0, -3, -3);
e = new Event("You did it, made it to second semester.", a, b, c, true);
events.add(e);

a = new Option("Neeeeed mooooooore sleeeeeeeep.", "happiness -5", 0, 0, -5, 0);
b = new Option("But first, lemme take a selfie. #selfie", "tardies +1, happiness +3", 1, 0, 3, 0);
c = new Option("Screw the diet. Sugar, sugar, aaaand more sugar.", "happiness -3", 0, 0, -3, 0);
e = new Event("You woke up too early, lowering your blood sugar levels.", a, b, c, true);
events.add(e);

a = new Option("ask your parents for money?", "$$$ +5, happiness -2", 0, 5, -2, 0);
b = new Option("get a job?", "$$$ + 10, academics -3", 0, 10, 0, -3);
c = new Option("do nothing?", "happiness -2", 0, 0, -2, 0);
e = new Event("Need a little bit more spending money. Do you...", a, b, c, true);
events.add(e);

a = new Option("All nighter!", "happiness -10, academics +5", 0, 0, -10, 5);
b = new Option("Comp Sci is waaaay more important.", "happiness -5, academics -5", 0, 0, -5, -5);
c = new Option("#SSS", "happiness +10, academics -15", 0, 0, 10, -15);
e = new Event("You have to cram for a huge physics midterm.", a, b, c, true);
events.add(e);

a = new Option("Of course! Shakespeare ftw!", "$$$ -3, happiness +5, academics +2", 0, -3, 5, 2);
b = new Option("Yaaay ice cream!", "$$$ -4; happiness +5", 0, -4, 5, 0);
c = new Option("ERWC! #bestclass", "happiness +2", 0, 0, 2, 0);
e = new Event("Ashland’s coming up. Are you going?", a, b, c, true);
events.add(e);

a = new Option("Lets go hang out at Snowflake!", "tardies +3, happiness +10", 3, 0, 10, 0);
b = new Option("You’ll stay home and have your parents call in sick.", "tardies +1, happiness +5", 1, 0, 5, 0);
c = new Option("But there’s school today!", "happiness -2", 0, 0, -2, 0);
e = new Event("What a nice day it is today...", a, b, c, true);
events.add(e);

a = new Option("For the millionth time.", "#werryju happiness +2", 0, 0, 2, 0);
b = new Option("Never again.", "happiness -5", 0, 0, -5, 0);
c = new Option("Let it go, let it gooooooo~", "happiness +1", 0, 0, 1, 0);
e = new Event("You go to watch Frozen.", a, b, c, true);
events.add(e);

a = new Option("Goodbye concentration.", "#ctong academics -2", 0, 0, 0, -2);
b = new Option("Make it stop!", "happiness -2, academics -2", 0, 0, -2, -2);
c = new Option("Can't hold it back anymore~", "happiness +5, academics -2", 0, 0, 5, -2);
e = new Event("“Let it Go” gets stuck in your head. AGAIN.
", a, b, c, true);
events.add(e);

a = new Option("Yeahhh! Gonna look spiffy with my date!", "$$$ -20, happiness +10", 0, -10, 10, 0);
b = new Option("Yay fishies.", "$$$ -10, happiness +7", 0, -10, 7, 0);
c = new Option("Ew. #foreveralone", "happiness -2", 0, 0, -2, 0);
e = new Event("Senior Ball is at CA Academy of Sciences! Are you excited?", a, b, c, true);
events.add(e);

a = new Option("Do you think I actually started?", "#SSS happiness -3, academics -10", 0, -0, -3, -10);
b = new Option("Submitted it yesterday, fools!", "happiness +3, academics +5", 0, 0, 3, 5);
c = new Option("What project? My job is to tell you to “close your laptops”.", "#werryju", 0, 0, 0, 0);
e = new Event("AP Computer Science project due tomorrow. How much do you more work do you have to do?", a, b, c, true);
events.add(e);

a = new Option("Party it up at the beach!", "tardies +5, happiness +10", 5, 0, 10, 0);
b = new Option("My parents made me go to school.", "#cry happiness -5", 0, 0, -5, 0);
c = new Option("Go shopping for more ties.", "#aiden $$$ -3, happiness +5", 0, -3, 5, 0);
e = new Event("The legendary Senior Ditch Day has arrived.", a, b, c, true);
events.add(e);

a = new Option("Victory is the only option.", "happiness +3, academics -3", 0, 0, 3, -3);
b = new Option("I can't believe I'm doing this.", "happiness -2", 0, 0, -2, 0);
c = new Option("Ignore all the pokes!", "happiness +3, academics +3", 0, 0, 3, 3);
e = new Event("You got caught up in a Facebook poke war.", a, b, c, true);
events.add(e);

a = new Option("College visits!", "#berkeleyclassof2018 $$$ -5", 0, -5, 0, 0);
b = new Option("Study for APs.", "#cry happiness -3, academics +5
", 0, 0, -3, 5);
c = new Option("Sleep all day, everyday.", "happiness +5", 0, 0, 5, 0);
e = new Event("You made it to spring break. Got any plans?", a, b, c, true);
events.add(e);

a = new Option("You rush off to N7.", "tardies +1", 1, 0, 0, 0);
b = new Option("Stroll to N7, cause who cares about class.", "tardies +1, academics -2", 1, 0, 0, -2);
c = new Option("#SSS", "tardies +2", 2, 0, 0, 0);
e = new Event("Oh no! You haven’t turned in any service learning forms and they’re due in 5 minutes.", a, b, c, true);
events.add(e);

a = new Option("Such grammar.", "academics -3", 0, 0, 0, -3);
b = new Option("Very doge.", "academics -2", 0, 0, 0, -2);
c = new Option("I hate this meme.", "tardies +3, $$$ -3, happiness -3, academics -3", 3, -3, -3, -3);
e = new Event("Much internet.", a, b, c, true);
events.add(e);

a = new Option("make an AI for it.", "#werryju happiness +5", 0, 0, 5, 0);
b = new Option("make a page for it.", "#lewischen happiness +3, academics -2", 0, 0, 3, -2);
c = new Option("rage quit.", "happiness -2", 0, 0, -2, 0);
e = new Event("Ugh! You just can’t get 2048, so you...", a, b, c, true);
events.add(e);

a = new Option("Use a random number generator, obviously.", "#werryju happiness -5", 0, 0, -5, 0);
b = new Option("Stanford, because Connecticut is super boring.", "happiness +3", 0, 0, 3, 0);
c = new Option("Yale, because New Haven has delicious pizza.", "happiness +3", 0, 0, 3, 0);
e = new Event("You have to decide between going to Yale or Stanford. What do you do?", a, b, c, true);
events.add(e);

a = new Option("Ugh.", "#wrongdirection happiness -3", 0, 0, -3, 0);
b = new Option("I can't hear myself think.", "happiness -2, academics -2", 0, 0, -2, -2);
c = new Option("Omg. I love this song.", "#jbforlife happiness +5", 0, 0, 5, 0);
e = new Event("Darn, your neighbor was blasting Justin Bieber and One Direction at 3 AM!", a, b, c, true);
events.add(e);

a = new Option("Tumblr.", "#worth happiness +5, academics -3
", 0, 0, 5, -3);
b = new Option("Reddit.", "happiness +3, academics -4", 0, 0, 3, -4);
c = new Option("XKCD", "happiness +4, academics -2", 0, 0, 4, -2);
e = new Event("Entire weekend spent on _______.", a, b, c, true);
events.add(e);

a = new Option("I hate Shakespeare.", "happiness -2, academics -2
", 0, 0, -2, -2);
b = new Option("Only 75 lines? Easy peasy.", "happiness +2, academics +2", 0, 0, 2, 2);
c = new Option("I'll just wing it.", "happiness +3, academics -5", 0, 0, 3, -5);
e = new Event("To project or not to project?", a, b, c, true);
events.add(e);

a = new Option("It's cool, I've been studying regularly!", "academics +5", 0, 0, 0, 5);
b = new Option("...Already? Brb cramming.", "happiness -2, academics +3", 0, 0, -2, 3);
c = new Option("Whatever.", "happiness +3, academics -5", 0, 0, 3, -5);
e = new Event("Awww shitake mushrooms, it’s finals week.", a, b, c, true);
events.add(e);

a = new Option("Heck yeeees!", "$$$ -10, happiness +10", 0, 0, -10, 10);
b = new Option("Woody scares me.", "happiness -3", 0, 0, -3, 0);
c = new Option("Bye guys, off to Asia", "$$$ -15, happiness +15", 0, -15, 15, 0);
e = new Event("Grad night at Disneyland! Do you go?", a, b, c, true);
events.add(e);
