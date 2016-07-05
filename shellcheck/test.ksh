#!/bin/ksh
###################################################
# Written By: Jason Thomas
# Purpose: This script was written to show users how to develop their first script
# May 1, 2008
###################################################
 
#Define Variables
HOME="/home/jthomas" #Simple home directory 
DATE=$(date) # Set DATE equal to the output of running the shell command date
HOSTNAME=$(hostname) # Set HOSTNAME equal to the output of the hostname command
PASSWORD_FILE="/etc/passwd" # Set AIX password file path
 
#Begin Code
 
for username in $(cat $PASSWORD_FILE | cut -f1 -d:)
do
 
       print $username
 
done#!/bin/ksh
###################################################
# Written By: Jason Thomas
# Purpose: This script was written to show users how to develop their first script
# May 1, 2008
###################################################

