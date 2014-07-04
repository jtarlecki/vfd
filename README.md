# VFD Rebate Calculator

#
## About

The **VFD Rebate Calculator** is a mobile web app that is aimed at commercial contractors who are trying to sell an aftermarket Variable Frequency Drive (VFD) to a potential customer, and would like to give a utility rebate estimate as part of their proposal.  The web app gives quick access to budgetary estimates of rebates, by having the user put in some general geographic information and the type of equipment they intend to install.

The app can be used at the following address:
[https://apps.realwinwin.com/vfd](https://apps.realwinwin.com/vfd)

## Background
After doing a study of the of all the utility rebate information for VFD installations, I manually designed a database to help gather all the pertinent info that would be the backbone data for a future calculator. (For a good primer on financial incentives for renewables and efficiency, visit the excellent resource [Database of State Incentives for Renewables & Efficiency](http://www.dsireusa.org/). In addition, following [link](http://www.dsireusa.org/incentives/index.cfm?EE=1&RE=1&SPV=0&ST=0&technology=motor_asd_vsd&sh=1) has a sorted list of programs that offer incentives for VFDs.)

I decided to try the open source software [WaveMaker](http://www.wavemaker.com/) because I wanted to develop rapidly and I had read decent reviews about the browser based-studio where java classes could be created by drag and drop.  It's true, although a little clunky and heavy (the software builds in a lot of crap).  At the time, I was the only developer at my company, so anything that could speed up the development cycle was crucial.

Overall, yes.  I wasn't bogged down writing verbose java with a million `getters` and `setters`.  Basically, if you have a decently designed database, this software will work pretty well.  It does all that monotonous coding.  Fortunately, I had designed the database as well, so my understanding of building the app through another software translated very well.

Anyway, the majority of the coding is Hybernate Query Language (`HQL`)to pull custom queries from the database, and the rest is just `javascript`.

## How to use
The mobile web app has four (4) options when it initializes:

1. Rebate**Overview**
2. Rebate**Aware**
3. Rebate**Advantage**
4. Rebate**Acquire**

All of which provide increasing levels of information to the user.  The idea was to have a free service to entice the user, and a pay service for access to some of the more granular aspects of the incentive database.

### RebateOverview
This feature gives a high-level overview of rebate eligible technology categories by state.  After selecting Rebate**Overview** in the home screen, navigate to the state you are interested in (or use the search box), and the final screen will display a dollar sign ($) for each technology category that are rebate-eligible.

### RebateAware

The aim of this section is to give the user a range of potential incentives for the installation of a VFD for a particular geography.  The app first asks for the user's **zipcode** in the first screen, whereby the app will deliver a series of choices via AJAX request of the relevant **electric utilities** that service that **zipcode**.  Utilities that offer rebates will be marked with a *check* *mark*, while utilities that do **not** offer energy efficiency rebate will be marked with an '*X*'.  If the utility has a check mark, then the user can continue to the next screen which gives a range of potential incentives for installation of a VFD, independent of the VFD's size or application.  This helps the user generally *quantify* this geography's potential for VFD installations.

### RebateAdvantage
Selecting this module is the most specific way the user can gain access to *exact* incentive information for their upcoming project.  Like the previous section, the user will have to input a **zipcode** and choose the appropriate **electric utility**.  In the next screen, the user will input to following information on the VFD's they intend to install: 

1. Quantity
2. Horsepower (hp)
3. Project type 
4. Specific application of the equipment

Upon successful completion of the short form, the user will then gain a listing of potential rebate programs that fit their project's criteria on the following screen, with specific dollar amount for the rebate.  In addition, the app shows the formula by which the program uses to calculate the rebate, including some fine print about the caps for the program and general notes relevant to this specific rebate.  Furthermore, there are some outbound links to the rebate program website and the rebate application.


### RebateAcquire

[Pending] The aim of this section is to collect specific project information from a customer to help facilitate the filing and capturing of rebates for their project. Typically, this service pertains to a custom energy efficiency project that may need energy savings calculations of energy modeling to quantify the potential savings.















## Welcome to MarkdownPad 2 ##

**MarkdownPad** is a full-featured Markdown editor for Windows.

### Built exclusively for Markdown ###

Enjoy first-class Markdown support with easy access to  Markdown syntax and convenient keyboard shortcuts.

Give them a try:

- **Bold** (`Ctrl+B`) and *Italic* (`Ctrl+I`)
- Quotes (`Ctrl+Q`)
- Code blocks (`Ctrl+K`)
- Headings 1, 2, 3 (`Ctrl+1`, `Ctrl+2`, `Ctrl+3`)
- Lists (`Ctrl+U` and `Ctrl+Shift+O`)

### See your changes instantly with LivePreview ###

Don't guess if your [hyperlink syntax](http://markdownpad.com) is correct; LivePreview will show you exactly what your document looks like every time you press a key.

### Make it your own ###

Fonts, color schemes, layouts and stylesheets are all 100% customizable so you can turn MarkdownPad into your perfect editor.

### A robust editor for advanced Markdown users ###

MarkdownPad supports multiple Markdown processing engines, including standard Markdown, Markdown Extra (with Table support) and GitHub Flavored Markdown.

With a tabbed document interface, PDF export, a built-in image uploader, session management, spell check, auto-save, syntax highlighting and a built-in CSS management interface, there's no limit to what you can do with MarkdownPad.
