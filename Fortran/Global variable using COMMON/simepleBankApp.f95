      PROGRAM BankApp
      REAL BALANCE
      COMMON /BANKDATA/ BALANCE
      BALANCE = 1000.0

10    CALL MENU
      GOTO 10
      END

      SUBROUTINE MENU
      REAL BALANCE
      COMMON /BANKDATA/ BALANCE
      INTEGER CHOICE
      REAL AMOUNT

      PRINT *, '1. Deposit'
      PRINT *, '2. Withdraw'
      PRINT *, '3. View Balance'
      PRINT *, '4. Exit'
      READ *, CHOICE

      IF (CHOICE .EQ. 1) THEN
         PRINT *, 'Enter amount:'
         READ *, AMOUNT
         BALANCE = BALANCE + AMOUNT
      ELSE IF (CHOICE .EQ. 2) THEN
         PRINT *, 'Enter amount:'
         READ *, AMOUNT
         BALANCE = BALANCE - AMOUNT
      ELSE IF (CHOICE .EQ. 3) THEN
         PRINT *, 'Balance = ', BALANCE
      ELSE IF (CHOICE .EQ. 4) THEN
         STOP
      END IF
      RETURN
      END