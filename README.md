# README #

Write a jQuery plugin which, given a jQuery object containing anchor elements (e.g $('a')), makes clicking on those elements open the link target in a new window.

The plugin should:

* Ensure that links with the same  `data­-window-­group`  open in the same window
* Take an option object used to set the features on the new window   (size, position, scrollbars,
etc.), sensible defaults should be supplied by the plugin.

# What is this repository for? #

* demonstrating use of the `jquery.anchor-new-window-on-link-click.js`


# Assumptions and Caveats ##

* all links are anchors with href attribute
* `windowSize` is the only default value provided by user

## Testing ##
_**Firefox 45.0.1** is expected by **Selenium Java WebDriver 2.53.1**_
_On OSX Selenium Java WebDriver 2.X expects Firefox installed in the default location of **/Application/**_
_maven build tool is need to pull down the selenium dependencies_
_Tested with Java 8_

### What is this repository for? ###

* Testing the Anchor Jquery plugin

### Dependencies ###
- Selenium Java WebDriver 2.53.1

### How to run tests ###
- `cd /path/to/root/of/project`
- `mvn clean test`