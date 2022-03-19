Goal of this excercise is to create a data entry form for following scenario:
Enter some parameters - validate your choices - enter additional optional info - show confirmation screen.

Requirements for the task:
Design UI for entering and viewing simple form consisting of:
- **Name** `a text field`, allowing to enter at minimum one word (actually needs to be at 1 char minimum, as a single hieroglyph can be a name), first character will be converted to upper case.
- **E-mail** `a text field`, validating at least to something like a@b
- **Requires transport** `a checkbox`
- optionally the **selection of transport types** (public transport, own car, someone else's car)
- depending on transport type selection:
    - in case own car was selected, ask for **number of available seats**
    - in case of someone else's car, offer **list of cars having some room**

On next screen display the choices in a convenient way (allow to go back and edit).
Ultimately there will be **Confirm trip** button.

By end all the participants for some event should have a means to travel to an event.

If anyone has extra time, can think about how to mark a car as booked so that a single vehicle would not end up having more than available free seats becoming booked.



Imagine about environments, where user is presented a choice.
Nowadays most of people are having in their pockets a screen consisting of at least FullHD worth of pixels or even more.

Just barely 20 years ago those phones had buttons, with a 400x300 screen, if you were lucky.

Even having those nifty Smart Phones - actually people do not need to see the fields at all.
All they need is a mechanism to pass the focus to next field and have some feedback about which step or entry is now having the attention.
Imagine being blind and having screenreader to help you and marked positions on screen to simulate keyboard input device.

Even already 20 years ago there were people who did not need screen to be attached to computer to work.
They had braille-enabled keyboards instead.

Even nowadays, in Healthcare section we can find people, who communicate by blinking their eyes, or twitching a toe.
Try to look back some famos scientists - how did he manage to talk to normal people just by staring at his screen, and maybe moving his fingers abit.

