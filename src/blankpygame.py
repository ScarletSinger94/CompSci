import pygame
pygame.init()
DISPLAYSURF = pygame.display.set_mode((800, 600))
pygame.display.set_caption('Love You Babe!')
while True: # main game loop
	for event in pygame.event.get():
		if event.type == QUIT:
            pygame.quit()
            sys.exit()
    pygame.display.update()

