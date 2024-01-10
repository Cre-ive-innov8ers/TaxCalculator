import javax.swing.JOptionPane;

public class TaxCalculator {
    public static void main(String[] args) {
        String inputName, inputAge, inputTaxYear, inputIncome;
        int age, taxYear;
        double income;
        // Double taxPayable = 0.00;

        // Prompt the user for inputs and check their validity
        inputName = JOptionPane.showInputDialog("Enter your name");
        inputAge = JOptionPane.showInputDialog("Enter your age");
        inputTaxYear = JOptionPane.showInputDialog("Enter the tax year");
        inputIncome = JOptionPane.showInputDialog("Enter your annual income (R)");

        while (true) {

            if (isAlphabetical(inputName) && isNumeric(inputAge) && isNumeric(inputTaxYear) && isNumeric(inputIncome)) {
                age = Integer.parseInt(inputAge);
                taxYear = Integer.parseInt(inputTaxYear);
                income = Double.parseDouble(inputIncome);
                if (income > 0) {
                    break; // Valid input, exit the loop
                } else {
                    inputIncome = JOptionPane.showInputDialog("Enter your annual income (R)");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid values.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // Calculate the tax based on the income brackets
        double taxPayable = 0.00;

        if (taxYear == 2022) {
            Double primary = 15714.00;
            Double secondary = 15714.00 + 8613.00;
            Double tertiary = 15714.00 + 8613.00 + 2871.00;
            if (age < 65 && income > 87300.00) { // Primary Tax rebate

                if (income >= 1.00 && income <= 216200.00) {
                    taxPayable = income * 0.18;
                } else if (income > 216200.00 && income <= 337800.00) {
                    taxPayable = 38916.00 + 0.26 * (income - 216200.00);
                } else if (income > 337800.00 && income <= 467500.00) {
                    taxPayable = 70532.00 + 0.31 * (income - 337800);
                } else if (income > 467500.00 && income <= 613600.00) {
                    taxPayable = 110739.00 + 0.36 * (income - 467500.00);
                } else if (income > 613600.00 && income <= 782200.00) {
                    taxPayable = 163335.00 + 0.39 * (income - 613600);
                } else if (income > 782200.00 && income <= 1656600.00) {
                    taxPayable = 229089.00 + 0.41 * (income - 782200.00);
                } else if (income > 1656600.00) {
                    taxPayable = 587593.00 + 0.45 * (income - 1656600.00);
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - primary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);

            } else if (age >= 65 && age < 75 && income > 135150.00) {
                if (income >= 1.00 && income <= 216200.00) {
                    taxPayable = income * 0.18;
                } else if (income > 216200.00 && income <= 337800.00) {
                    taxPayable = 38916.00 + 0.26 * (income - 216200.00);
                } else if (income > 337800.00 && income <= 467500.00) {
                    taxPayable = 70532.00 + 0.31 * (income - 337800);
                } else if (income > 467500.00 && income <= 613600.00) {
                    taxPayable = 110739.00 + 0.36 * (income - 467500.00);
                } else if (income > 613600.00 && income <= 782200.00) {
                    taxPayable = 163335.00 + 0.39 * (income - 613600);
                } else if (income > 782200.00 && income <= 1656600.00) {
                    taxPayable = 229089.00 + 0.41 * (income - 782200.00);
                } else if (income > 1656600.00) {
                    taxPayable = 587593.00 + 0.45 * (income - 1656600.00);
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - secondary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);

            } else if (age >= 75 && income > 151100.00) {
                if (income >= 1.00 && income <= 216200.00) {
                    taxPayable = income * 0.18;
                } else if (income > 216200.00 && income <= 337800.00) {
                    taxPayable = 38916.00 + 0.26 * (income - 216200.00);
                } else if (income > 337800.00 && income <= 467500.00) {
                    taxPayable = 70532.00 + 0.31 * (income - 337800);
                } else if (income > 467500.00 && income <= 613600.00) {
                    taxPayable = 110739.00 + 0.36 * (income - 467500.00);
                } else if (income > 613600.00 && income <= 782200.00) {
                    taxPayable = 163335.00 + 0.39 * (income - 613600);
                } else if (income > 782200.00 && income <= 1656600.00) {
                    taxPayable = 229089.00 + 0.41 * (income - 782200.00);
                } else if (income > 1656600.00) {
                    taxPayable = 587593.00 + 0.45 * (income - 1656600.00);
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - tertiary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + taxPayable+ 
                        " and take away salary is R"+ (income - taxPayable - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } else if (taxYear == 2023) {
            Double primary = 16425.00;
            Double secondary = 16425.00 + 9000.00;
            Double tertiary = 16425.00 + 9000.00 + 2997.00;
            if (age < 65 && income > 91250.00) {
                if (income >= 1.00 && income <= 226000.00) {
                    taxPayable = income * 0.18;
                } else if (income > 226000.00 && income <= 353100.00) {
                    taxPayable = 40680.00 + (income - 226000.00) * 0.26;
                } else if (income > 353100.00 && income <= 488700.00) {
                    taxPayable = 73726.00 + (income - 353100.00) * 0.31;
                } else if (income > 488700.00 && income <= 641400.00) {
                    taxPayable = 115762.00 + (income - 488700.00) * 0.36;
                } else if (income > 641400.00 && income <= 817600.00) {
                    taxPayable = 170734.00 + (income - 641400.00) * 0.39;
                } else if (income > 817600.00 && income <= 1731600.00) {
                    taxPayable = 239452.00 + (income - 817600.00) * 0.41;
                } else if (income > 1731600.00) {
                    taxPayable = 614192.00 + (income - 1731600.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - primary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (age >= 65 && age < 75 && income > 141250.00) {
                if (income >= 1.00 && income <= 226000.00) {
                    taxPayable = income * 0.18;
                } else if (income > 226000.00 && income <= 353100.00) {
                    taxPayable = 40680.00 + (income - 226000.00) * 0.26;
                } else if (income > 353100.00 && income <= 488700.00) {
                    taxPayable = 73726.00 + (income - 353100.00) * 0.31;
                } else if (income > 488700.00 && income <= 641400.00) {
                    taxPayable = 115762.00 + (income - 488700.00) * 0.36;
                } else if (income > 641400.00 && income <= 817600.00) {
                    taxPayable = 170734.00 + (income - 641400.00) * 0.39;
                } else if (income > 817600.00 && income <= 1731600.00) {
                    taxPayable = 239452.00 + (income - 817600.00) * 0.41;
                } else if (income > 1731600.00) {
                    taxPayable = 614192.00 + (income - 1731600.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - secondary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (age >= 75 && income > 157900.00) {
                if (income >= 1.00 && income <= 226000.00) {
                    taxPayable = income * 0.18;
                } else if (income > 226000.00 && income <= 353100.00) {
                    taxPayable = 40680.00 + (income - 226000.00) * 0.26;
                } else if (income > 353100.00 && income <= 488700.00) {
                    taxPayable = 73726.00 + (income - 353100.00) * 0.31;
                } else if (income > 488700.00 && income <= 641400.00) {
                    taxPayable = 115762.00 + (income - 488700.00) * 0.36;
                } else if (income > 641400.00 && income <= 817600.00) {
                    taxPayable = 170734.00 + (income - 641400.00) * 0.39;
                } else if (income > 817600.00 && income <= 1731600.00) {
                    taxPayable = 239452.00 + (income - 817600.00) * 0.41;
                } else if (income > 1731600.00) {
                    taxPayable = 614192.00 + (income - 1731600.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - tertiary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + taxPayable + 
                        " and take away salary is R"+ (income - taxPayable - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } else if (taxYear == 2024) {
            Double primary = 17235.00;
            Double secondary = 17235.00 + 9444.00;
            Double tertiary = 17235.00 + 9444.00 + 3145.00;
            if (age < 65 && income > 95750.00) {
                if (income >= 1.00 && income <= 237100.00) {
                    taxPayable = income * 0.18;
                } else if (income > 237100.00 && income <= 370500.00) {
                    taxPayable = 42678.00 + (income - 237100.00) * 0.26;
                } else if (income > 370500.00 && income <= 512800.00) {
                    taxPayable = 77362.00 + (income - 370500.00) * 0.31;
                } else if (income > 512800.00 && income <= 673000.00) {
                    taxPayable = 121475.00 + (income - 512800.00) * 0.36;
                } else if (income > 673000.00 && income <= 857900.00) {
                    taxPayable = 191147.00 + (income - 673000.00) * 0.39;
                } else if (income > 857900.00 && income <= 1817000.00) {
                    taxPayable = 251258.00 + (income - 857900.00) * 0.41;
                } else if (income > 1817000.00) {
                    taxPayable = 644489.00 + (income - 1817000.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - primary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (age >= 65 && age < 75 && income > 148217.00) {
                if (income >= 1.00 && income <= 237100.00) {
                    taxPayable = income * 0.18;
                } else if (income > 237100.00 && income <= 370500.00) {
                    taxPayable = 42678.00 + (income - 237100.00) * 0.26;
                } else if (income > 370500.00 && income <= 512800.00) {
                    taxPayable = 77362.00 + (income - 370500.00) * 0.31;
                } else if (income > 512800.00 && income <= 673000.00) {
                    taxPayable = 121475.00 + (income - 512800.00) * 0.36;
                } else if (income > 673000.00 && income <= 857900.00) {
                    taxPayable = 191147.00 + (income - 673000.00) * 0.39;
                } else if (income > 857900.00 && income <= 1817000.00) {
                    taxPayable = 251258.00 + (income - 857900.00) * 0.41;
                } else if (income > 1817000.00) {
                    taxPayable = 644489.00 + (income - 1817000.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - secondary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (age >= 75 && income > 165689.00) {
                if (income >= 1.00 && income <= 237100.00) {
                    taxPayable = income * 0.18;
                } else if (income > 237100.00 && income <= 370500.00) {
                    taxPayable = 42678.00 + (income - 237100.00) * 0.26;
                } else if (income > 370500.00 && income <= 512800.00) {
                    taxPayable = 77362.00 + (income - 370500.00) * 0.31;
                } else if (income > 512800.00 && income <= 673000.00) {
                    taxPayable = 121475.00 + (income - 512800.00) * 0.36;
                } else if (income > 673000.00 && income <= 857900.00) {
                    taxPayable = 191147.00 + (income - 673000.00) * 0.39;
                } else if (income > 857900.00 && income <= 1817000.00) {
                    taxPayable = 251258.00 + (income - 857900.00) * 0.41;
                } else if (income > 1817000.00) {
                    taxPayable = 644489.00 + (income - 1817000.00) * 0.45;
                }

                // Rebate subtraction
                Double rebatedIncome = taxPayable - tertiary;
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + rebatedIncome + 
                        " and take away salary is R"+ (income - rebatedIncome - 0.01*income)+" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display the result in a message dialog
                JOptionPane.showMessageDialog(null,
                        "Tax payable for " + inputName + "'s annual income of R" + income + " is R" + taxPayable + 
                        " and take away salary is R"+ (income - taxPayable - 0.01*income) +" After deducting 1% UIF.",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    // Check if a given string is alphabetical
    private static boolean isAlphabetical(String str) {
        return str.matches("[a-zA-Z ]+");
    }

    // Check if a given string is numeric
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
