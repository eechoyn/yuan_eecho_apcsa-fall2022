/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/water.jpg");
	  water.explore(); 
	  water.fixUnderwater(); 
	  water.explore(); 
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/arch.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/arch.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/640x4801.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  public static void testCopy() {
	  Picture canvas = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/640x480.jpg");
	  Picture flower1 = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/flower1.jpg");
	  Picture flower2 = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/flower2.jpg"); 
	  canvas.explore();
	  canvas.copy(flower1, 0, 0); 
	  canvas.explore();
  }
  
  public static void testCopy2() {
	  Picture canvas = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/640x480.jpg");
	  Picture flower1 = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/flower1.jpg");
	  Picture flower2 = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/flower2.jpg"); 
	  canvas.explore();
	  canvas.copy2(flower1, 0,30,0,30); 
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testEncodeAndDecode()
  {
    Picture swan = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/swan.jpg");
    Picture message = new Picture("/Users/eechoyuan/Desktop/Unit16-Assignments-pixLab/images/msg.jpg"); 
    swan.explore();
    swan.encode(message); 
    swan.explore();
    swan.decode().explore(); 
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft(); 
//	  testMirrorHorizontal(); 
//	  testMirrorHorizontalBotToTop(); 
//	  testMirrorDiagonal(); 
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testCollage();
//    testCopy();
//    testCopy2();
//	 testMyCollage(); 
//    testEdgeDetection();
//    testEdgeDetection2();
    //testChromakey();
    testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}