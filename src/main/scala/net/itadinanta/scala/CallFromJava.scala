package net.itadinanta.scala

class CallFromJava(val x: Int = 0, val y: Int = 0)
/*
 * 
 * public class CallFromJava {
 * 		private final Integer x;
 * 		private final Integer y;
 * 
 * 		public CallFromJava() {
 * 			this(new Integer(0), new Integer(0));
 * 		}
 * 
 * 		public CallFromJava(Integer x) {
 * 			this(x, new Integer(0));
 * 		}
 * 
 * 		public CallFromJava(Integer x, Integer y) {
 * 			this(x, y);
 * 		}
 * 
 * 		public Integer x() {
 * 			return this.x;
 * 		}
 * 
 * 		public Integer y() {
 * 			return this.y;
 * 		}
 * }
 */
class AnotherClassHere(val a: Int = 0, val b: Int = 0)