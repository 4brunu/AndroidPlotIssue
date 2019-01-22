# AndroidPlotIssue

This repo is to demonstrate an issue while upgrading from AndroidPlot 0.6.1 to 1.5.6.

The problem is that in version 1.0.0, the folowing API `XYPlot.graphWidget.setGridPadding(float left, float top, float right, float bottom)` was removed, and I can't find a equivalent one.

You can check the problem and the solutions I tried [here](https://github.com/4brunu/AndroidPlotIssue/blob/8df0d1fd1a7441350858f786e8df0e1a777be37d/app/src/main/java/com/example/androidplotissue/MainActivity.kt#L25)

Here is one screenshot with the grid padding, that show's the label in all points.

![Alt text](Screenshot_with_gridpadding.png?raw=true "screenshot with grid padding")

And here is one screenshot without the grid padding, that don't show the label in all points.

![Alt text](Screenshot_without_gridpadding.png?raw=true "screenshot without grid padding")

