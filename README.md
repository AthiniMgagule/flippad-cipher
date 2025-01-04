# FlipPad Cipher

The FlipPad Cipher is a custom encryption method that combines a unique transformation process with a one-time pad (OTP) for enhanced security. This cipher is designed for educational and personal use and implements the following encryption steps:

1. **Split the Word**:
   - The input text is divided into two halves. For odd-length words, the extra character is assigned to the first half.

2. **Reverse the Second Half**:
   - The second half of the word is reversed to introduce a layer of obfuscation.

3. **Apply the One-Time Pad**:
   - A one-time pad is applied to both halves of the transformed text, ensuring strong encryption.

4. **Recombine the Halves**:
   - The processed halves are concatenated to form the final encrypted output.

### Features
- Strong security through one-time pad encryption.
- Obfuscation via reversal of part of the input.
- Suitable for short, string-based encryption tasks.

### How It Works
#### Encryption Example:
1. Input: `cipher`
2. Split: `cip` and `her`
3. Reverse second half: `cip` and `reh`
4. Apply OTP (key: `[4, 5, 9, 3, 8, 2]`):
   - First half: `cip` becomes `how`
   - Second half: `reh` becomes `vmj`
5. Recombine: `howvmj`

### Installation and Usage
To use the FlipPad Cipher:
1. Clone this repository:
   ```bash
   git clone https://github.com/AthiniMgagule/flippad-cipher.git
   ```
2. Navigate to the project directory:
   ```bash
   cd flippad-cipher
   ```
3. Compile and run the Java program:
   ```bash
   javac FlipPadCipher.java
   java FlipPadCipher
   ```

### License
This project is proprietary and confidential. Unauthorized copying, modification, or distribution of this software, in part or whole, is strictly prohibited.

### Contributing
Contributions are not accepted for this project, as it is strictly for personal or educational use. Please contact the author for any inquiries.

### Contact
For more information or questions about the FlipPad Cipher, please contact:
- **Name**: [Athini Mgagule]
- **Email**: [athinimgagule03@gmail.com]

---

© [Athini Mgagule], [2025]. All rights reserved.

