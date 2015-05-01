# Frequently Asked Questions #

### What is charts4j? ###

charts4j is a chart API for Java that developers can use in their Java code to programmatically generate nearly all the charts available in [Google Chart Tools](http://code.google.com/apis/chart/image/index.html). Under the hood, charts4j leverages [Google Chart Tools](http://code.google.com/apis/chart/image/index.html) to create cool looking charts.

### What reasons would make me not choose charts4j for my Java charting requirements? ###

charts4j and the Google Chart API is a wonderful, lightweight technology for quickly generating quality charts while maintaining a low footprint on your application. But there are a few _deal breakers_ that should be disclaimed upfront:

  1. No Internet connection, no charts. Your application must be connected to the Internet because the charts are ultimately rendered by the Google Chart API.
  1. If you have lots of data, roughly speaking, more than 2000 data points, your application should try to sample data less frequently, and use the simple encoding scheme. Otherwise, this technology may not be right for you. Alternatively, you can also try submitting a HTTP POST request.


### Why is charts4j useful for me? ###

charts4j allows you to **programmatically** generate charts from within your Java code via a simple, intuitive, and **lightweight** Java API. Moreover, it hides the ugly details of creating the URL parameters that are necessary for communicating with the Google Chart API.

### Why do I need an Internet connection to use charts4j? ###

charts4j merely makes communicating with the Google Chart API from within your Java code much easier. Once you have defined your GChart Java object, you will call [a method](http://charts4j.googlecode.com/svn/tags/v1.2/doc/com/googlecode/charts4j/GChart.html#toURLString()) that will generate a URL that looks like something this

http://chart.apis.google.com/chart?cht=lc&chs=200x125&chd=s:helloWorld&chxt=x,y&chxl=0:|Mar|Apr|May|June|July|1:||50+Kb

Use the URL to retrieve your PNG image. Or embed the URL in an HTML image tag that can then be displayed in a web page. The best solution is to **programmatically** incorporate the URLs that are dynamically generated in your web or Internet application with the help of charts4j, and embed those URLs in your view technology (e.g. JSPs, Swing, etc.).

### How do I get charts4j? ###

Grab the [latest zip](http://code.google.com/p/charts4j/downloads/list) or [check out](http://code.google.com/p/charts4j/source/checkout) the source via SVN.

### How do I use charts4j in my Java programs? ###

Once you have downloaded and included the charts4j.jar in your classpath, you will have to start writing some code. The best way to learn the charts4j API is to follow some [example code](http://charts4j.googlecode.com) (see chart gallery) and to read the [javadocs](http://charts4j.googlecode.com/svn/tags/v1.2/doc/index.html).

### Is charts4j free? ###

Yes.


### Why does my data have to be between 0 and 100? What do I do about negative numbers, etc.? ###

This issue is at the heart of every computer graphics API. Users must supply the API data that is in an expected range so that it can be rendered. If your data falls outside the 0 to 100 range it must be **scaled** which is easy to do. See next item.

### How do I scale my data? ###

See the [DataUtil](http://charts4j.googlecode.com/svn/tags/v1.2/doc/com/googlecode/charts4j/DataUtil.html) class documentation in the [javadocs](http://charts4j.googlecode.com/svn/tags/v1.2/doc/index.html).

### What are the licensing terms? ###

charts4j is released under the [MIT License](http://www.opensource.org/licenses/mit-license.php), the most relaxed, permissive open-source license I could find.

### Do I need to give anybody credit if I use charts4j? ###

If you wish, as a courtesy you can link back to http://charts4j.googlecode.com/.

### What about long URLs and lots of data? ###

There is an interesting discussion on this topic [here](http://www.boutell.com/newfaq/misc/urllength.html). If you have large quantities of data (> 2000 points) you want displayed in one chart, you should try to sample your data less frequently. Otherwise, this technology may not be right for you.

## Where can I find code examples? ##

[Chart gallery with examples](http://charts4j.googlecode.com)

###