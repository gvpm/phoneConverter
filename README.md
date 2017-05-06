# phoneConverter

This program receives as input a file with expressions representing phone numbers. One in each line.

- An expression is composed  of letters (A-Z), hifens (-) and the numbers 1 and 0.

- An expression has to have at leats 1 character and  no more than 30.

EG: 

1-HOME-SWEET-HOME

MY-MISERABLE-JOB
    
    
- It will create an output file converting each expression into a correspondent phone number. And will also print the output.

EG: 

1-4663-79338-4663

69-647372253-562

    
- The convertion follows those rules.

ABC = 2

DEF = 3

GHI = 4

JKL = 5

MNO = 6

PQRS = 7

TUV = 8

WXYZ = 9


- If the character is not listed it remains the same.

## Running the Program.
- Go to the phoneConverterRun  folder.
- There you can find the program "PhoneConverter.jar" and the sample input file "input.txt".

You have 3 ways of running the program:


`java -jar PhoneConverter.jar `

- This option will use the default values and will convert the file "input.txt" into "output.txt"


`java -jar PhoneConverter.jar youtInputName.txt `

- This option will use the default "output.txt" and will convert the file you set as input to it. - 


`java -jar PhoneConverter.jar youtInputName.txt outputName`

- This will not use any default values. It will  convert the file "youtInputName.txt" into "outputName.txt"
