# General

Files in the `xcf/` folder are GIMP files made with version 2.8. Use this version to take advantage of layer groups in
the image. These images serve as source images.

The file `male_sprites.xcf` contains all the different animations, including the animations for walk, slash, hurt, and
spellcast from base LPC assets. Additionally, it includes bow and thrust animations which are made by me.

Images in the `png/` folder are all sprite animation sheets in 64x64 px grids. Files are sorted by animation type in
separate folders, named using the convention `BODYPART_part_name`.

In some cases, part names contain suggestions for use as a kit, e.g., "leather_armor", "robe", "plate_armor", "
chain_armor," but many more combinations are possible. The files `BODY_male` in the folders hurt, slash, spellcast, and
walkcycle are part of the base LPC assets and are provided for completeness.

The folder `examples/` contains animated GIF images that demonstrate different clothes, equipment, and color
combinations. You can preview them easily in a web browser or image manipulation program.

Note that the skeleton animation sheet is compatible with the clothes and equipment sprites, but the combat dummy
animation is not.

# Animation Sequence Information

## Bow Animation:

1. Raise bow and aim
1. Loose arrow
1. Grab new arrow
1. Aim new arrow
1. Loose new arrow

## Thrust Animation:

1. Raise staff
1. Thrust loop.

## Skeleton (and Male) Walk Animation:

1. Stand/idle
1. Walk cycle

# Sprite Order Information

The best order to place sprites from top to bottom is visible in the `xcf` files:

- WEAPON
- HANDS
- HEAD
- BELT
- TORSO
- LEGS
- FEET
- BODY
- BEHIND

# GIF Animation Tips

To create an animated GIF from any of the sprite sheets, use ImageMagick and issue the following commands:

1. Cut the sheet into separate image files:
   ```bash
   convert some_sheet_name.png -crop 64x64 +repage +adjoin tile_%02d.png
   ```
1. Join the images into a GIF:
   ```bash
   Copy code
   convert -delay 12 -loop 0 -dispose Background tile_*.png animation.gif
   ```

# Contact

- **Johannes Sjölund**
- **Email**: j.sjolund@gmail.com
- **Freenode**: wulax