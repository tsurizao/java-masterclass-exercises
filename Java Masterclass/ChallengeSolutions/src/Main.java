public class Main {
    public static void main(String[] args) {

        System.out.println("Is this a leap year? " + LeapYearCalculator.isLeapYear(1924));
        MegaByteConverter.printMegaBytesAndKiloBytes(456767);
        System.out.println("Should I wake up? " + BarkingDog.shouldWakeUp(true, 3));
        System.out.println("Are these equal by three decimal places? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.1237, 3.123));
        System.out.println("Does a + b = c ? " + EqualSumChecker.hasEqualSum(3, 4, 7));
        System.out.println("===========================================");
        System.out.println("Is this a teen number? " + TeenNumberChecker.isTeen(19));
        System.out.println("Are any of these numbers teens? " + TeenNumberChecker.hasTeen(6, 17, 99));
        FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, 5);
        FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(100);
        System.out.println("===========================================");
        System.out.println(SecondsAndMinutesTwo.getDurationStringTwo(61, 59));
        System.out.println(SecondsAndMinutesTwo.getDurationStringTwo(98765));
        MinutesToYearsAndDays.printYearsAndDays(1051200);
        System.out.println("Circle area = " + AreaCalculator.area(5));
        System.out.println("Rectangle area = " + AreaCalculator.area(5, 4));
        System.out.println("===========================================");
        EqualityPrinter.printEqual(1 ,2, 3);
        System.out.println("Is the cat playing? " + PlayingCat.isCatPlaying(false, 35));
        System.out.println("In the month and year tested there are " + NumberOfDays.getDaysInMonth(2, 2020) + " days, takes into account Leap Year");
        SpeedConverter.printConversion(254);
        System.out.println(Sum3And5.sum3And5(1, 1000));
        System.out.println("===========================================");
        System.out.println(SumOdd.sumOdd(100, 1000));
        System.out.println(DigitSum.sumDigits(123));
        System.out.println(NumberPalindrome.isPalindrome(-123321));
        System.out.println("While loop " + FirstAndLastDigitSumWhileLoop.sumFirstAndLastDigit(252));
        System.out.println("For Loop " + FirstAndLastDigitSumForLoop.sumFirstAndLastDigit(257));
        System.out.println("===========================================");
        System.out.println("For Loop sum of all even numbers is " + EvenDigitSumForLoop.getEvenDigitSum(123456789));
        System.out.println("While Loop sum of all even numbers is " + EvenDigitSumWhileLoop.getEvenDigitSum(123456789));
        System.out.println("Do any of these contain the same last digit? " + LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println("Using For Loop " + GreatestCommonDivisorForLoop.getGreatestCommonDivisor(12, 30));
        System.out.println("Using While Loop " + GreatestCommonDivisorWhileLoop.getGreatestCommonDivisor(12, 30));
        System.out.println("===========================================");
        System.out.println(SharedDigit.hasSharedDigit(12, 13));
        System.out.println("This is the While Loop");
        AllFactorsWhileLoop.printFactors(64);
        System.out.println("This is the For Loop");
        AllFactorsForLoop.printFactors(64);
        System.out.println("===========================================");
        System.out.println("Perfect Number While Loop");
        System.out.println(PerfectNumberWhileLoop.isPerfectNumber(28));
        System.out.println("Perfect Number For Loop");
        System.out.println(PerfectNumberForLoop.isPerfectNumber(28));
        NumberToWords.numberToWords(123);
        System.out.println(FlourPackProblem.canPack(1, 0, 4));
        System.out.println(LargestPrimeFactor.getLargestPrime(7));
        System.out.println("============================================");
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}
