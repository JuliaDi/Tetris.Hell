/**
 * This class holds an int x/y point for use by Tetris, and supports equals()
 * and toString() methods.
 */
public class TPoint
{
    public int x;
    public int y;

    /**
     * @param x
     * @param y
     */
    public TPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public TPoint(TPoint point)
    {
        this.x = point.x;
        this.y = point.y;
    }

    public boolean equals(Object other)
    {
        // standard two checks for equals()
        if (this == other)
            return true;
        if (!(other instanceof TPoint))
            return false;

        // check if other point same as us
        TPoint pt = (TPoint) other;
        return (x == pt.x && y == pt.y);
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
