# New in version 1.3 #

charts4j has been Mavenized

HTTP post support now available

Fixed minor bug in Venn Diagram API

Fixed inconsistency with the way margins are set on charts

Added additional legend position options available in the Google Charts API

charts4j has migrated to Java 1.6

# New in version 1.2 #

Added GWT client-side support.

Now supporting configurability for other Google charts end point URLs (e.g.
JFreeChart Eastwood Servlet.)

Fixed bug b/c incorrectly assumed that axis label numeric ranges had to run in the positive direction.

Google-o-meter now supports title and legend options.

Pie chart now supports legends.

Support for chart margins and legend margins.

Pie charts can now be oriented.

Axis style now accommodates better control for tick marks. Moreover, an axis text alignment bug in the Google Chart API has been hidden from the API user.

Support for periodic shape and text markers in a given range.

Added ability to add free text and shape markers not associated with a plot.

Fixed i18n bug

Added scaling convenience methods.

Improved javadoc

Can now set label interval on the numeric range labels.

Bars can now be individually colored in a bar chart.

Optimized string building performance and eliminating the need for intermediate String objects.

Relaxed the pie chart API a bit. If slices do not add up to 100, slices will be
proportional to the total of all slices.

Enabling automatic resize of bar chart bars bars to fit space.

Text markers can now be flagged.