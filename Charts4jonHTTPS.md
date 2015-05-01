# Introduction #

On an HTTPS secured site all resources should be accessed over HTTPS as well.
So when requesting a google charts image via HTTP the browser would show a warning message about mixed HTTPS and HTTP content.

# Solution #

```
AbstractGChart chart;
...
chart.setURLEndpoint("//chart.googleapis.com/chart");
```

  * chart.apis.google.com, the default endpoint, does not currently support HTTPS, but chart.googleapis.com does.
  * The [protocol-relative](http://paulirish.com/2010/the-protocol-relative-url/) address will let the browser automatically choose whether to use HTTP or HTTPS.