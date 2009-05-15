/**
 *
 * The MIT License
 *
 * Copyright (c) 2008 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.googlecode.charts4j;

import org.junit.Ignore;

/**
 * @author Julien Chastang (julien.c.chastang at gmail dot com)
 *
 */
@Ignore
class TestUtil {

    /**
     * Get a basic chart.
     *
     * @return Get a basic chart.
     */
    static LineChart getBasicChart() {
        final Plot plot = Plots.newPlot(Data.newData(0, 50, 100));
        return GCharts.newLineChart(plot);
    }

    /**
     * Get a basic bar chart.
     *
     * @return Get a basic bar chart.
     */
    static BarChart getBasicBarChart() {
        final Plot plot = Plots.newPlot(Data.newData(70, 50, 100));
        return GCharts.newBarChart(plot);
    }


    /**
     * Get a basic line.
     *
     * @return Get a basic line.
     */
    static Line getBasicLine() {
        return Plots.newLine(Data.newData(0, 50, 100));
    }
}
