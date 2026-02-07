      PROGRAM CountToFive
      INTEGER I
      I = 1
 10   PRINT *, I
      I = I + 1
      IF (I .LE. 5) GOTO 10
      STOP
      END