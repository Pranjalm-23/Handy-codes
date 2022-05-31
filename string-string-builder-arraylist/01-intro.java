// We can take string as input using two methods:

// scn.next(): It will read the input until space (" ") or end-of-line has occurred.
// scn.nextLine(): It will read the input until end-of-line has occurred.
// Since, scn.nextLine() ignores spaces, a sentence with many words and spaces in between can be taken input in a single string object using it.

// >> string is much more than a char array, its not a char array

// Case 1
// Input:
// Pepcoding Rocks
String s1 = scn.next();  // upto next space

String s2 = scn.next();
System.out.println(s1);
System.out.println(s2);

// Case 2
// Input:
// Pepcoding
// Rocks
String s1 = scn.next();  // upto next line if no space found earlier
String s2 = scn.next();
System.out.println(s1);
System.out.println(s2);


// // Case 3
// // Input:
// // Pepcoding Rocks
String s1 = scn.nextLine();  // whole line
String s2 = scn.next();
System.out.println(s1);
System.out.println(s2);

// Case 4:
// Input:
// Pepcoding Rocks
// And Shines
String s1 = scn.nextLine();
String s2 = scn.nextLine();
System.out.println(s1);
System.out.println(s2);

System.out.println(s1.length());  // to find length

System.out.println(s1.charAt(1));  // char at thr index

// we cant set the  characters of string using (charAt any index)


// >> substring

String s = "Pranjal " ;
System.out.println(s.substring(1));  // "ranjal " // upto end

System.out.println(s.substring(0,0));  // ""

System.out.println(s.substring(0, 1));  // P

System.out.println(s.substring(1, 5));  // Pranj   // (i, j) ==> ith to j-1th chars

// to print all substrings of a string
for (int i =0; i < s.length(); i++)
{
  for(int j = i+1; j < s.length(); j++)
  {
    System.out.println(s.substring(i, j));
    
  }
}


// concatention

String sk = "pk";
String sl = "pm"
String snew = sk + sl;  // snew = pkpm
String sn2 = sk + "pranjal" // pkpranjal
String sn3 = sk + 4; // pk4

System.out.println("Hello" + 10 + 20);  // left to right interction ==> hello1020


// >>>> split the string by char

String s = "abc deef ghi jkl";
String[] parts = s.split(" ");

for(int i= 0; i < parts.length; i++)
{
  System.out.println(parts[i]);
  
}

