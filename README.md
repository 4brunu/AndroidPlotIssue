# AndroidPlotIssue

This repo is to demonstrate an issue while upgrading from AndroidPlot 0.6.1 to 1.5.6.


The problem is that in version 1.0.0, the folowing API `XYPlot.graphWidget.setGridPadding(float left, float top, float right, float bottom)` was removed, and I can't find a equivalent one.

Here is one screenshot with the grid padding, that show's the label in all points.



And here is one screenshot without the grid padding, that don't show the label in all points.
