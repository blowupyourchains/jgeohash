package org.jgeohash.distance;

import org.jgeohash.GeoHashPoint;
import org.jgeohash.GeoHashUtils;
import org.jgeohash.Point;
import org.jgeohash.api.Position;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

/**
 * The Class DistanceCalculatorTest.
 */
public class DistanceCalculatorTest {

	/**
	 * The Constant WIDTH_9_CELL represents the width from a cell from a geohash
	 * value with 9 characters.
	 **/
	public static final double WIDTH_9_CELL = 0.00477;

	/**
	 * The Constant HEIGHT_9_CELL represents the height from a cell from a
	 * geohash value with 9 characters.
	 **/
	public static final double HEIGHT_9_CELL = 0.00283;

	/**
	 * The Constant WIDTH_8_CELL represents the width from a cell from a geohash
	 * value with 8 characters.
	 **/
	public static final double WIDTH_8_CELL = 0.02509;

	/**
	 * The Constant HEIGHT_8_CELL represents the height from a cell from a
	 * geohash value with 8 characters.
	 **/
	public static final double HEIGHT_8_CELL = 0.01908;

	/**
	 * The Constant WIDTH_7_CELL represents the width from a cell from a geohash
	 * value with 7 characters.
	 **/
	public static final double WIDTH_7_CELL = 0.10039;

	/**
	 * The Constant HEIGHT_7_CELL represents the height from a cell from a
	 * geohash value with 7 characters.
	 **/
	public static final double HEIGHT_7_CELL = 0.15269;

	/**
	 * The Constant WIDTH_6_CELL represents the width from a cell from a geohash
	 * value with 6 characters.
	 **/
	public static final double WIDTH_6_CELL = 0.80315;

	/**
	 * The Constant HEIGHT_6_CELL represents the height from a cell from a
	 * geohash value with 6 characters.
	 **/
	public static final double HEIGHT_6_CELL = 0.61078;

	/**
	 * The Constant WIDTH_5_CELL represents the width from a cell from a geohash
	 * value with 5 characters.
	 **/
	public static final double WIDTH_5_CELL = 3.21280;

	/**
	 * The Constant HEIGHT_5_CELL represents the height from a cell from a
	 * geohash value with 5 characters.
	 **/
	public static final double HEIGHT_5_CELL = 4.88626;

	/**
	 * The Constant WIDTH_4_CELL represents the width from a cell from a geohash
	 * value with 4 characters.
	 **/
	public static final double WIDTH_4_CELL = 25.66850;

	/**
	 * The Constant HEIGHT_4_CELL represents the height from a cell from a
	 * geohash value with 4 characters.
	 **/
	public static final double HEIGHT_4_CELL = 19.54504;

	/**
	 * The Constant WIDTH_3_CELL represents the width from a cell from a geohash
	 * value with 3 characters.
	 **/
	public static final double WIDTH_3_CELL = 103.57409;

	/**
	 * The Constant HEIGHT_3_CELL represents the height from a cell from a
	 * geohash value with 3 characters.
	 **/
	public static final double HEIGHT_3_CELL = 156.36034;

	/**
	 * The Constant WIDTH_2_CELL represents the width from a cell from a geohash
	 * value with 2 characters.
	 **/
	public static final double WIDTH_2_CELL = 625.44137;

	/**
	 * The Constant HEIGHT_2_CELL represents the height from a cell from a
	 * geohash value with 2 characters.
	 **/
	public static final double HEIGHT_2_CELL = 744.37693;

	/**
	 * The Constant WIDTH_1_CELL represents the width from a cell from a geohash
	 * value with 1 characters.
	 **/
	public static final double WIDTH_1_CELL = 4604.31836;

	/**
	 * The Constant HEIGHT_1_CELL represents the height from a cell from a
	 * geohash value with 1 characters.
	 **/
	public static final double HEIGHT_1_CELL = 5003.53096;

	/**
	 * Test distance between points.
	 */
	@Test
	public void testDistanceBetweenPoints() {
		String alterTeichwegGeohash = "u1x0v54rmjwej";
		
		double[] coordinates = GeoHashUtils
				.decodeAndRound(alterTeichwegGeohash);
		Position alterTeichweg = new Point(coordinates[0], coordinates[1]);
		Position ludwigsburg = new GeoHashPoint(48.889380, 9.190459);
		String ludwigsburgGeohash = ((GeoHashPoint) ludwigsburg).getGeohash();
		double distance2 = DistanceCalculator.distanceBetweenPoints(
				ludwigsburg, alterTeichweg, MeasuringUnit.KILOMETER);
		AssertJUnit.assertEquals(distance2, 525.875517661088);

		double distance3 = DistanceCalculator.distanceBetweenPoints(
				ludwigsburgGeohash, alterTeichwegGeohash,
				MeasuringUnit.KILOMETER);
		AssertJUnit.assertEquals(distance3, 525.875517737948);

	}

}