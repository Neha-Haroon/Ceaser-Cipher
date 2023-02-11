SNAPSHOTS/ SCREENSHOTS ARE MADE AVAILABLE FOR REFERENCING AT EASE

This jAVA Ceaser Cipher pakage code consist of 3 files mainly:
1. ENCRYPT---------------------------------------------------------------

dedicated to implement the encrypt class for the pakage 

It takes 
-'plaintext' of string type ( the string that is needed to be ciphered.
-a number 'shift' (how many alphabets does each aphabet has to shift places )
as input
-if the string is includes special characters they will not be included in the cipher process and the pointer will move to the next element in the string 
-if any character of the string is in lower case, they will first be capitalized then converts the plaintext string to ciphertext according to the shift taken as input

2. DECRYPT---------------------------------------------------------------

dedicated to implement the decrypt class for the pakage 

-It takes 
-'Ciphertext' of string type ( the string that is needed to be ciphered.
-a number 'shift' (how many alphabets does each aphabet has to unshift places )
as input
-if the string is includes special characters they will not be included in the cipher process and the pointer will move to the next element in the string 
-if any character of the string is in lower case, they will first be capitalized then unciphered


3. RUNNER---------------------------------------------------------------

-this file is the center of the pakage
-it takes plaintexts, ciphertexts as input from seperate text files
-Handles file not found error through 'try and catch' statements
-takes file name as input in console
- shift is set to 3 in this file to be sent to encrypt and decrypt files
