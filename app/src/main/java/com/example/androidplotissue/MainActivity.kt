package com.example.androidplotissue

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.xy.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plot = findViewById<XYPlot>(R.id.plot)

        val serie1Values = listOf<Number>(8, 4, 2, 8, 4, 16, 8, 25, 16, 8)

        val series1 = SimpleXYSeries(
            serie1Values,
            SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,
            "Series1"
        )

        plot.setDomainStep(XYStepMode.INCREMENT_BY_VAL, serie1Values.size.toDouble())
        plot.graphWidget.setGridPadding(25f, 50f, 25f, 25f)

        val series1Format = LineAndPointFormatter()
        series1Format.pointLabelFormatter = PointLabelFormatter()

        plot.addSeries(series1, series1Format)

    }
}
