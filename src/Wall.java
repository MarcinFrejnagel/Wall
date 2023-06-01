import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Wall implements Structure {
    private List<Block> blocks;
    private CompositeBlock compositeBlock;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlock.getBlocks().stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return compositeBlock.getBlocks().stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(toList());
    }

    @Override
    public int count() {
        return compositeBlock.getBlocks().size();
    }
}