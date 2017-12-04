#ifndef AndresLlausas_ProjectOne_included
#define AndresLlausas_ProjectOne_included
/* Node in the binary tree */
typedef struct Node_s {
  char *string;
  struct Node_s *left;
  struct Node_s *right;
} Node;

/* Add a Node to the Tree */
Node *add(Node *tp, char *str);

/* Print all nodes in the tree */
void printTree(Node *tp);

/* Remove a node form the tree */
Node *removeName(Node *tp, char *s);

/* Auxiliary method used to find the smallest child when deleting a node */
Node *smallestChild(Node *tp);

/*Make the tree from the file you already have */
Node *makeTree();

#endif


