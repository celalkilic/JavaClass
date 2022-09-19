package week9Tuesday;
/**
 * this is an interface TableGenerator with 2 abstract methods.
 *
 * Any class that implements this interface CAN-DO
 * 1. generate table in any way. and 2. check table in any way.
 *
 * We do not currently know, how and what kind of table should be generated,
 * and we do not even know how to check it. Since it is all ABSTRACT.
 * We know the functionality is there but implementation is hidden/not here.
 */
interface TableGenerator {

    public abstract int[] generateTable(int value, int numberOfEntries);
    public abstract boolean checkTable(int value, int[] tableToTest);
}

public class MultiplicationTable implements TableGenerator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] generateTable(int value, int numberOfEntries) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkTable(int value, int[] tableToTest) {
		// TODO Auto-generated method stub
		return false;
	}
	 /**
     * returns a multiplication table of
     * specified number with a specified length.
     * @param value - the multiplication table returned will be of that number
     *              ( for example 5 will return: 0,5,10,15...).
     * @param numberOfEntries - the number of entries (positions)  the returned array will hold (for example
     *                        if its 3 the returned array will have 3 ints.
     * @return an int array containing a multiplication table.
     *
     * Example:
     *  generate_table(3,5);
     * returns: [0,3,6,9,12]
     *  each number is multiplier of 3, starts from 0
      *  generate_table(9,3);
     *  returns: [0,9,18]
     */
     //create your method here

    /**
     * checks if a multiplication table is of the correct values
     * and correct sequence for the given
     * @param value
     * @param tableToTest
     * @return true or false
     *
     * Please look at examples below:
     *
     *
    mult = [0,3,6,9,12,15]
    check_table(3,mult);
    returns:true since each number in array is multiplication
    for 3

    mult = [0,3,6,999,12,15]
    check_table(3,mult);
    returns:false

    mult = [0,9,18]
    check_table(9,mult);
    returns:true

    mult = [0,9,18]
    check_table(3,mult);
    returns:false
     */
     //create your method here

}
