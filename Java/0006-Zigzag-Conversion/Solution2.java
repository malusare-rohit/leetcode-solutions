class Solution {
    public String convert(String s, int numRows) {

        // If only one row, zigzag conversion is not needed
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1; // 1 = down, -1 = up

        // Place characters in zigzag rows
        for (char ch : s.toCharArray()) {

            rows[currentRow].append(ch);

            // Change direction at first and last row
            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}