package geometry;
// extending GeometricObject for use with Triangle data
    public class Octogon extends GeometricObject implements Cloneable,
    	Comparable<Octogon> {
    		private double side;
    		
    		//constructors
    		public Octogon(double side) {
    			this.side = side;
    		}
    		public void setSide(double side) {
    			this.side = side;
    		}
    		
    		//accessors
    		public double getSide() {
    			return side;
    		}
    		public double getArea() {
    			return (2 + 4 / Math.sqrt(2)) * side * side;
    		}
    		public double getPerimeter() {
    			return 8 * side;
    		}
    		
    		@Override
    		public int compareTo(Octogon o) {
    			if (getArea() > o.getArea()) {
    				return 1;
    			} else if (getArea() < o.getArea()) {
    				return -1;
    			}
    			return 0;
    		}
    		@Override
    		public Object clone() throws CloneNotSupportedException {
    			return (Octogon)super.clone();
    		}
    	}