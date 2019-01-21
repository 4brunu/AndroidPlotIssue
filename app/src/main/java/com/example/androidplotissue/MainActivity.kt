package com.example.androidplotissue

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.xy.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plot = findViewById<XYPlot>(R.id.plot)

        configurePlotAspect(plot)

        configurePlotSeries(plot)

    }

    private fun configurePlotAspect(xyPlot: XYPlot) {

        xyPlot.borderPaint.color = Color.TRANSPARENT
        xyPlot.backgroundPaint.color = Color.TRANSPARENT

        xyPlot.graphWidget.rangeGridLinePaint.color = Color.TRANSPARENT

        xyPlot.graphWidget.domainOriginLinePaint.color = Color.TRANSPARENT
        xyPlot.graphWidget.rangeOriginLinePaint.color = Color.TRANSPARENT

    }

    private fun configurePlotSeries(xyPlot: XYPlot) {

        val serie1Values = listOf<Number>(8, 4, 2, 8, 4, 16, 8, 25, 16, 8)

        val series1 = SimpleXYSeries(
            serie1Values,
            SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,
            "Series1"
        )

        xyPlot.setDomainStep(XYStepMode.INCREMENT_BY_VAL, serie1Values.size.toDouble())
        xyPlot.setRangeBoundaries(0, 30, BoundaryMode.FIXED)

        xyPlot.graphWidget.setGridPadding(20f, 0f, 20f, 0f)

        val series1Format = LineAndPointFormatter()
        series1Format.pointLabelFormatter = PointLabelFormatter()

        // add a new series' to the xyplot:
        plot.addSeries(series1, series1Format)

    }
}
