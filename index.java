import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println();
        int round, round_hw, round_lab;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("1.homework");
            System.out.println("2.lab");
            System.out.println("0.exit");
            System.out.print("your choice : ");
            round = sc.nextInt();
            switch (round) {
                case 1:
                    do {
                        System.out.println("------------------------------------------");
                        for (int i = 1; i <= 6; i++) {
                            System.out.println(i + "." + "homework " + i);
                        }
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        round_hw = sc.nextInt();
                        switch (round_hw) {
                            // home work 1
                            case 1:
                                homework1(sc, args);
                                break;
                            // home work 2
                            case 2:
                                homework2(sc, args);
                                break;
                            // home work 3
                            case 3:
                                homework3(sc, args);
                                break;
                            // home work 4
                            case 4:
                                homework4(sc, args);
                                break;
                            // home work 5
                            case 5:
                                homework5(sc, args);
                                break;
                            // home work 6
                            case 6:
                                homework6(sc, args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                        }
                    } while (round_hw != 0);
                    break;
                case 2:
                    do {
                        System.out.println("------------------------------------------");
                        for (int i = 1; i <= 2; i++) {
                            System.out.println(i + "." + "lab " + i);
                        }
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        round_lab = sc.nextInt();
                        switch (round_lab) {
                            // lab 1
                            case 1:
                                lab1(sc, args);
                                break;
                            // lab 2
                            case 2:
                                lab2(sc, args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                        }
                    } while (round_lab != 0);
                    break;
                case 0:
                    System.out.println("Bye <3");
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (round != 0);
        sc.close();
        System.out.println();
    }

    public static void homework1(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 1 :");
            System.out.println("1: Bin2Dec");
            System.out.println("2: BoxPattern");
            System.out.println("3: CeasarCode");
            System.out.println("4: CheckerPattern");
            System.out.println("5: CheckHexStr");
            System.out.println("6: CountVowelsDigits");
            System.out.println("7: DecipherCeasarCode");
            System.out.println("8: ExchangeCipher");
            System.out.println("9: Factorial");
            System.out.println("10: Hex2Dec");
            System.out.println("11: HillPattern");
            System.out.println("12: Oct2Dec");
            System.out.println("13: PhoneKeyPadA");
            System.out.println("14: PhoneKeyPadB");
            System.out.println("15: RadixN2Dec");
            System.out.println("16: RadixN2DecRewrite");
            System.out.println("17: ReverseString");
            System.out.println("18: SquarePattern");
            System.out.println("19: SquarePattern1");
            System.out.println("20: TestPalindromicPhrase");
            System.out.println("21: TimeTable");
            System.out.println("22: TriangularPattern");
            System.out.println("0: Back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    homework.homework1.Bin2Dec.main(args);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    homework.homework1.BoxPattern.main(args);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    homework.homework1.CeasarCode.main(args);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    homework.homework1.CheckHexStr.main(args);
                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    homework.homework1.CheckerPattern.main(args);
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    homework.homework1.CountVowelsDigits.main(args);
                    break;
                case 7:
                    System.out.println("------------------------------------------");
                    homework.homework1.DecipherCeasarCode.main(args);
                    break;
                case 8:
                    System.out.println("------------------------------------------");
                    homework.homework1.ExchangeCipher.main(args);
                    break;
                case 9:
                    System.out.println("------------------------------------------");
                    homework.homework1.Factorial.main(args);
                    break;
                case 10:
                    System.out.println("------------------------------------------");
                    homework.homework1.Hex2Dec.main(args);
                    break;
                case 11:
                    System.out.println("------------------------------------------");
                    homework.homework1.HillPattern.main(args);
                    break;
                case 12:
                    System.out.println("------------------------------------------");
                    homework.homework1.Oct2Dec.main(args);
                    break;
                case 13:
                    System.out.println("------------------------------------------");
                    homework.homework1.PhoneKeyPadA.main(args);
                    break;
                case 14:
                    System.out.println("------------------------------------------");
                    homework.homework1.PhoneKeyPadB.main(args);
                    break;
                case 15:
                    System.out.println("------------------------------------------");
                    homework.homework1.RadixN2Dec.main(args);
                    break;
                case 16:
                    System.out.println("------------------------------------------");
                    homework.homework1.RadixN2DecRewrite.main(args);
                    break;
                case 17:
                    System.out.println("------------------------------------------");
                    homework.homework1.ReverseString.main(args);
                    break;
                case 18:
                    System.out.println("------------------------------------------");
                    homework.homework1.SquarePattern.main(args);
                    break;
                case 19:
                    System.out.println("------------------------------------------");
                    homework.homework1.SquarePattern1.main(args);
                    break;
                case 20:
                    System.out.println("------------------------------------------");
                    homework.homework1.TestPalindromicPhrase.main(args);
                    break;
                case 21:
                    System.out.println("------------------------------------------");
                    homework.homework1.TimeTable.main(args);
                    break;
                case 22:
                    System.out.println("------------------------------------------");
                    homework.homework1.TriangularPattern.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void homework2(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 2 :");
            System.out.println("1.Matrix(1.1)");
            System.out.println("2.TrigonometricSeries(1.2)");
            System.out.println("3.SpecialSeries(1.3)");
            System.out.println("4.FactorialHandlingOverflow(1.4)");
            System.out.println("5.FibonacciIntHandlingOverflow(1.5)");
            System.out.println("6.NumberConversion,(1.6)");
            System.out.println("7.NumberGuess(1.7)");
            System.out.println("8.WordGuess(1.8)");
            System.out.println("9.DateUtil(1.9)");
            System.out.println("10.FactorialRecursion(2.1)");
            System.out.println("11.FibonacciRecursive(2.2)");
            System.out.println("12.LengthOfARunningNumberSequenceRecursive(2.3)");
            System.out.println("13.GCDRecursive(2.4)");
            System.out.println("14.LinearSearch(3.1)");
            System.out.println("15.RecursiveBinarySearch(3.2)");
            System.out.println("16.BubbleSort(3.3)");
            System.out.println("17.SelectionSort(3.4)");
            System.out.println("18.InsertionSort(3.5)");
            System.out.println("19.PerfectNumberList(4.1)");
            System.out.println("20.PrimeList(4.2)");
            System.out.println("21.PerfectPrimeFactorList(4.3)");
            System.out.println("22.GCD(4.4)");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    homework.homework2.Matrix.main(args);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    homework.homework2.TrigonometricSeries.main(args);

                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    homework.homework2.SpecialSeries.main(args);

                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    homework.homework2.FactorialHandlingOverflow.main(args);

                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    homework.homework2.FibonacciIntHandlingOverflow.main(args);

                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    homework.homework2.NumberConversion.main(args);

                    break;
                case 7:
                    System.out.println("------------------------------------------");
                    homework.homework2.NumberGuest.main(args);

                    break;
                case 8:
                    System.out.println("------------------------------------------");
                    homework.homework2.WordGuess.main(args);

                    break;
                case 9:
                    System.out.println("------------------------------------------");
                    homework.homework2.DateUtil.main(args);

                    break;
                case 10:
                    System.out.println("------------------------------------------");
                    homework.homework2.FactorialRecursion.main(args);

                    break;
                case 11:
                    System.out.println("------------------------------------------");
                    homework.homework2.FibonacciRecursive.main(args);

                    break;
                case 12:
                    System.out.println("------------------------------------------");
                    homework.homework2.LengthOfARunningNumberSequenceRecursive.main(args);

                    break;
                case 13:
                    System.out.println("------------------------------------------");
                    homework.homework2.GCDRecursive.main(args);

                    break;
                case 14:
                    System.out.println("------------------------------------------");
                    homework.homework2.LinearSearch.main(args);

                    break;
                case 15:
                    System.out.println("------------------------------------------");
                    homework.homework2.RecursiveBinarySearch.main(args);

                    break;
                case 16:
                    System.out.println("------------------------------------------");
                    homework.homework2.BubbleSort.main(args);
                    break;
                case 17:
                    System.out.println("------------------------------------------");
                    homework.homework2.SelectionSort.main(args);
                    break;
                case 18:
                    System.out.println("------------------------------------------");
                    homework.homework2.InsertionSort.main(args);
                    break;
                case 19:
                    System.out.println("------------------------------------------");
                    homework.homework2.PerfectNumberList.main(args);
                    break;
                case 20:
                    System.out.println("------------------------------------------");
                    homework.homework2.PrimeList.main(args);
                    break;
                case 21:
                    System.out.println("------------------------------------------");
                    homework.homework2.PerfectPrimeFactorList.main(args);
                    break;
                case 22:
                    System.out.println("------------------------------------------");
                    homework.homework2.GCD.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void homework3(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 3 :");
            System.out.println("1.Part 1");
            System.out.println("2.Part 2");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                // part 1
                case 1:
                    int input_part1;
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("1.Circle 1 (1.1)");
                        System.out.println("2.Circle 2 (1.2)");
                        System.out.println("3.Rectangle (1.3)");
                        System.out.println("4.Employee (1.4)");
                        System.out.println("5.InvoiceItem (1.5)");
                        System.out.println("6.Account (1.6)");
                        System.out.println("7.Date (1.7)");
                        System.out.println("8.Time (1.8)");
                        System.out.println("9.Ball (1.9)");
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        input_part1 = sc.nextInt();
                        switch (input_part1) {
                            case 1:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.circle1.TestCircle.main(args);
                                break;
                            case 2:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.circle2.TestMain.main(args);
                                break;
                            case 3:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.rectangle.TestMain.main(args);
                                break;
                            case 4:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.employee.TestMain.main(args);
                                break;
                            case 5:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.invoiceitem.TestMain.main(args);
                                break;
                            case 6:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.account.TestMain.main(args);
                                break;
                            case 7:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.date.TestMain.main(args);
                                break;
                            case 8:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.time.TestMain.main(args);
                                break;
                            case 9:
                                System.out.println("------------------------------------------");
                                homework.homework3.part1.ball.TestMain.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                                break;
                        }
                    } while (input_part1 != 0);
                    break;
                // part 2
                case 2:
                    int input_part2;
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("1.Book (2.1)");
                        System.out.println("2.(Advanced) Book (2.2)");
                        System.out.println("3.(Your turn) Book (2.3)");
                        System.out.println("4.Invoice (2.4)");
                        System.out.println("5.Account (2.5)");
                        System.out.println("6.MyPoint (2.6)");
                        System.out.println("7.MyLine (2.7)");
                        System.out.println("8.MyCircle (2.8)");
                        System.out.println("9.MyTriangle (2.9)");
                        System.out.println("10.MyRectangle (2.10)");
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        input_part2 = sc.nextInt();
                        switch (input_part2) {
                            case 1:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.book.introduction.TestBook.main(args);
                                homework.homework3.part2.book.introduction.TestAuthor.main(args);
                                break;
                            case 2:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.book.advanced.TestBook.main(args);
                                homework.homework3.part2.book.advanced.TestAuthor.main(args);
                                break;
                            case 3:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.book.yourturn.TestMain.main(args);
                                break;
                            case 4:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.invoice.TestMain.main(args);
                                break;
                            case 5:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.account.TestMain.main(args);
                                break;
                            case 6:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.mypoint.MyPointTest.main(args);
                                break;
                            case 7:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.mypoint.MyLineTest.main(args);
                                break;
                            case 8:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.mypoint.MyCircleTest.main(args);
                                break;
                            case 9:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.mypoint.MyTriangleTest.main(args);
                                break;
                            case 10:
                                System.out.println("------------------------------------------");
                                homework.homework3.part2.mypoint.MyRectangleTest.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                                break;
                        }
                    } while (input_part2 != 0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void homework4(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 4 :");
            System.out.println("1: ball_player ");
            System.out.println("2: bouncingball ");
            System.out.println("3: complex ");
            System.out.println("4: date ");
            System.out.println("5: polynomial ");
            System.out.println("6: time ");
            System.out.println("0: Back");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    homework.homework4.ballplayer.TestMain.main(args);
                    ;
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    homework.homework4.bouncingballs.TestMain.main(args);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    homework.homework4.mycomplex.TestMain.main(args);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    homework.homework4.mydate.TestMain.main(args);
                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    homework.homework4.polynomial.TestMain.main(args);
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    homework.homework4.mytime.TestMain.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void homework5(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 5 :");
            System.out.println("1.Part 1");
            System.out.println("2.Part 2");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                // part 1
                case 1:
                    int input_part1;
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("1.bai 1");
                        System.out.println("2.bai 2");
                        System.out.println("3.bai 3");
                        System.out.println("4.bai 4");
                        System.out.println("5.bai 5");
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        input_part1 = sc.nextInt();
                        switch (input_part1) {
                            case 1:
                                System.out.println("------------------------------------------");
                                homework.homework5.part1.bai1.Test.main(args);
                                break;
                            case 2:
                                System.out.println("------------------------------------------");
                                homework.homework5.part1.bai2.Test.main(args);
                                break;
                            case 3:
                                System.out.println("------------------------------------------");
                                homework.homework5.part1.bai3.Test.main(args);
                                break;
                            case 4:
                                System.out.println("------------------------------------------");
                                homework.homework5.part1.bai4.CircleTest.main(args);
                                homework.homework5.part1.bai4.RectangleTest.main(args);
                                homework.homework5.part1.bai4.ShapeTest.main(args);
                                homework.homework5.part1.bai4.SquareTest.main(args);
                                break;
                            case 5:
                                System.out.println("------------------------------------------");
                                homework.homework5.part1.bai5.Test.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                                break;
                        }
                    } while (input_part1 != 0);
                    break;
                // part 2
                case 2:
                    int input_part2;
                    do {
                        System.out.println("------------------------------------------");
                        System.out.println("1.bai 1");
                        System.out.println("2.bai 2");
                        System.out.println("0.back");
                        System.out.print("your choice : ");
                        input_part2 = sc.nextInt();
                        switch (input_part2) {
                            case 1:
                                System.out.println("------------------------------------------");
                                homework.homework5.part2.bai1.Test.main(args);
                                break;
                            case 2:
                                System.out.println("------------------------------------------");
                                homework.homework5.part2.bai2.TestLine.main(args);
                                homework.homework5.part2.bai2.TestLineSp.main(args);
                                homework.homework5.part2.bai2.TestPoint.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Your choice is not correct ! Please try again");
                                break;
                        }
                    } while (input_part2 != 0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void homework6(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("homework 6 :");
            System.out.println("1.bai 1");
            System.out.println("2.bai 2");
            System.out.println("3.bai 3");
            System.out.println("4.bai 4");
            System.out.println("5.bai 5");
            System.out.println("6.bai 6");
            System.out.println("7.bai 7");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai1.test.main(args);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai2.test.main(args);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai3.test.main(args);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai4.test.main(args);
                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai5.test.main(args);
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai6.test.main(args);
                    break;
                case 7:
                    System.out.println("------------------------------------------");
                    homework.homework6.bai7.test.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);

    }

    public static void lab1(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("lab 1 :");
            System.out.println("1.CheckPassFail(1.1)");
            System.out.println("2.CheckOddEven(1.2)");
            System.out.println("3.PrintNumberInWord(1.3)");
            System.out.println("4.PrintDayInWord(1.4)");
            System.out.println("5.SumAverageRunningInt(2.1)");
            System.out.println("6.HarmonicSum(2.2)");
            System.out.println("7.ComputePI(2.3)");
            System.out.println("8.Fibonacci(2.4.1)");
            System.out.println("9.Tribonacci(2.4.2)");
            System.out.println("10.ExtractDigits(2.5)");
            System.out.println("11.SumProductMinMax3(3.1)");
            System.out.println("12.CircleComputation(3.2)");
            System.out.println("13.PensionContributionCalculator(3.3)");
            System.out.println("14.PensionContributionCalculatorWithSentinel(3.4)");
            System.out.println("15.ReverseInt(3.5)");
            System.out.println("16.InputValidation(3.6)");
            System.out.println("17.AverageWithInputValidation(3.7)");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    lab.lab1.CheckPassFail.main(args);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    lab.lab1.CheckOddEven.main(args);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    lab.lab1.PrintNumberInWord.main(args);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    lab.lab1.PrintDayInWord.main(args);
                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    lab.lab1.SumAverageRunningInt.main(args);
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    lab.lab1.HarmonicSum.main(args);
                    break;
                case 7:
                    System.out.println("------------------------------------------");
                    lab.lab1.ComputePI.main(args);
                    break;
                case 8:
                    System.out.println("------------------------------------------");
                    lab.lab1.Fibonacci.main(args);
                    break;
                case 9:
                    System.out.println("------------------------------------------");
                    lab.lab1.Tribonacci.main(args);
                    break;
                case 10:
                    System.out.println("------------------------------------------");
                    lab.lab1.ExtractDigits.main(args);
                    break;
                case 11:
                    System.out.println("------------------------------------------");
                    lab.lab1.SumProductMinMax3.main(args);
                    break;
                case 12:
                    System.out.println("------------------------------------------");
                    lab.lab1.CircleComputation.main(args);
                    break;
                case 13:
                    System.out.println("------------------------------------------");
                    lab.lab1.PensionContributionCalculator.main(args);
                    break;
                case 14:
                    System.out.println("------------------------------------------");
                    lab.lab1.PensionContributionCalculatorWithSentinel.main(args);
                    break;
                case 15:
                    System.out.println("------------------------------------------");
                    lab.lab1.ReverseInt.main(args);
                    break;
                case 16:
                    System.out.println("------------------------------------------");
                    lab.lab1.InputValidation.main(args);
                    break;
                case 17:
                    System.out.println("------------------------------------------");
                    lab.lab1.AverageWithInputValidation.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

    public static void lab2(Scanner sc, String[] args) {
        int input;
        do {
            System.out.println("------------------------------------------");
            System.out.println("lab 2 :");
            System.out.println("1: ArrayToString");
            System.out.println("2: Contains");
            System.out.println("3: CopyOf");
            System.out.println("4: Dec2Hex");
            System.out.println("5: Equals");
            System.out.println("6: Exponent");
            System.out.println("7: GradesHistogram");
            System.out.println("8: GradesStatistics1_3");
            System.out.println("9: GradesStatistics2_11");
            System.out.println("10: Hex2Bin");
            System.out.println("11: MagicSum");
            System.out.println("12: Print");
            System.out.println("13: PrintArray");
            System.out.println("14: PrintArrayInStars");
            System.out.println("15: Reverse");
            System.out.println("16: Search");
            System.out.println("17: Swap");
            System.out.println("0.back");
            System.out.print("your choice : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------------------");
                    lab.lab2.ArrayToString.main(args);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    lab.lab2.Contains.main(args);
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    lab.lab2.CopyOf.main(args);
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    lab.lab2.Dec2Hex.main(args);
                    break;
                case 5:
                    System.out.println("------------------------------------------");
                    lab.lab2.Equals.main(args);
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    lab.lab2.Exponent.main(args);
                    break;
                case 7:
                    System.out.println("------------------------------------------");
                    lab.lab2.GradesHistogram.main(args);
                    break;
                case 8:
                    System.out.println("------------------------------------------");
                    lab.lab2.GradesStatistics1_3.main(args);
                    break;
                case 9:
                    System.out.println("------------------------------------------");
                    lab.lab2.GradesStatistics2_11.main(args);
                    break;
                case 10:
                    System.out.println("------------------------------------------");
                    lab.lab2.Hex2Bin.main(args);
                    break;
                case 11:
                    System.out.println("------------------------------------------");
                    lab.lab2.MagicSum.main(args);
                    break;
                case 12:
                    System.out.println("------------------------------------------");
                    lab.lab2.Print.main(args);
                    break;
                case 13:
                    System.out.println("------------------------------------------");
                    lab.lab2.PrintArray.main(args);
                    break;
                case 14:
                    System.out.println("------------------------------------------");
                    lab.lab2.PrintArrayInStars.main(args);
                    break;
                case 15:
                    System.out.println("------------------------------------------");
                    lab.lab2.Reverse.main(args);
                    break;
                case 16:
                    System.out.println("------------------------------------------");
                    lab.lab2.Search.main(args);
                    break;
                case 17:
                    System.out.println("------------------------------------------");
                    lab.lab2.Swap.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your choice is not correct ! Please try again");
                    break;
            }
        } while (input != 0);
    }

}
