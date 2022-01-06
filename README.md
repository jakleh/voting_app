This program reads in a single input file that displays information regarding a single election, and
then displays a ballot. The ballot counts votes indiscriminately. Once the ballot is closed, an
output file containing the election results is produced.

The input file’s first line always specifies the name of the office for which the candidates are running.
The second line specifies how many candidates are running for office (the number of lines that follow
must equal the number specified on the second line). The following lines each start with the name of a
candidate, followed by a semicolon, followed by said candidate’s party affiliation.

To launch the program via jar file, navigate to the project folder and click on the subfolder labeled “jar.”
Then, drag the file into the “source” subfolder. Open the terminal, navigate to the proper directory, and
and run the following command:

java -jar PerfectCandidate.jar

Once the program is launched, a window will appear. Click the “Browse” button and navigate to the
correct input file (it should be within the same folder as the source code). Click the input file, and then
click the “Open” button.

Once the file has been opened, the user may vote on a candidate by clicking the name of said candidate
and then clicking the “Cast Vote” button. Users may vote for a candidate as many times as they like.
To finish voting, click the red button at the top-left corner of the window and then click the “Yes”
button. Then, type the desired output-file name in the console followed by “.txt” and click the “Browse”
button. Click on whichever folder will be used to store the output file, and that is where the election
results may be found.

The output file’s first line begins with “RESULTS,” followed by the name of the office for which
the candidates are running. The second line is a line of dashes whose length equals the number of
characters in the first line (if there are extra spaces after the office name in the input file, then there
will be extra dashes in the second line of the output file). The following lines (barring the last) specify
the candidate and their respective party on the left, and the number of votes received by said candidate
on the right. The last line writes “WINNER,” followed by the candidate and their party affiliation.
