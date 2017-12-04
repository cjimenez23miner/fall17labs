
all: TreeDemo

CFLAGS=-g -O3

# Symbols helpful for understanding the productions
#   $@ is the production's target
#   $^ are the production's prerequisites

TreeDemo: AndresLlausas_ProjectOne.c 
	gcc -o $@ $^

AndresLlausas_ProjectOne.o: AndresLlausas_ProjectOne.c AndresLlausas_ProjectOne.h
	gcc -o $(CFLAGS) AndresLlausas_ProjectOne.c

clean:
	rm -f *.o TreeDemo
demo: TreeDemo
	./TreeDemo


