package com.example.task04;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Function;

public class Line {
    private Point start;
    private  Point end;
    private  Function<Point, Boolean> LineEquation;

    public  Line(Point start,Point end)
    {
        this.start=start;
        this.end=end;
        //уравнение прямой сопоставляется с точкой и возвращается результат
        LineEquation = (point -> (point.x-start.x*1.0)/ (end.x- start.x)== (point.y- start.y*1.0)/ (end.y- start.y) );
    }

    public Point getP1()
    {
        return start;
    }

    public Point getP2()
    {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public boolean isCollinearLine(Point p)
    {
        return LineEquation.apply(p);
    }
}
