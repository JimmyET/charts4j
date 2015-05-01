# Introduction #

The goal of the charts4j-gwt port is to offer a GWT client-side version of the charts4j project. In particular, charts4j-gwt conforms to the GWT JRE subset. The API is identical to that of charts4j, but we made a few changes "under the hood" to achieve GWT JRE compliance. The port also contains GWT specific files such as the module XML definition (charts4j.gwt.xml).

With charts4j-gwt, data can be passed to browser and rendered in any of the supported charts leveraging GWT technology.

Note that in a GWT environment, charts4j has always functioned server-side, in the servlet layer, as is, but this port adds GWT client side support for charts4j.

This port is compatible with GWT 1.5 and above.

# Getting Started #

To use charts4j-gwt with your GWT project, simply complete the following steps:
  * [Download charts4j-gwt](http://code.google.com/p/charts4j/downloads/list)
  * Add the JAR to your project.
  * Update your module definition to inherit charts4j-gwt:

```
 <inherits name='com.googlecode.charts4j' />
```